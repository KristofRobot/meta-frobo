This is a layer to build frobo, a differential drive ROS-based robot, in an OpenEmbedded Linux system.

Please see the corresponding sections below for details.

## DEPENDENCIES

This layer depends on:

  URI: git://git.openembedded.org/bitbake  
  branch: master  

  URI: git://git.openembedded.org/openembedded-core  
  layers: meta  
  branch: master  

  URI: git://git.openembedded.org/meta-openembedded  
  layers: meta-oe meta-networking  
  branch: master  

  URI: git://github.com/bmwcarit/meta-ros  
  branch: master  

  URI: git://github.com/linux-sunxi/meta-sunxi  
  branch: master

## BUILD

To build a cubieboard2 image that can be directly used on frobo:

* Download dependencies
```
  mkdir ~/OE
  cd ~/OE
  git clone git://git.openembedded.org/bitbake/
  git clone git://git.openembedded.org/openembedded-core
  git clone git://git.openembedded.org/meta-openembedded
  git clone https://github.com/bmwcarit/meta-ros.git
  git clone git://github.com/linux-sunxi/meta-sunxi
  git clone https://github.com/KristofRobot/meta-frobo
  ln -s ~/OE/bitbake ~/OE/openembedded-core/bitbake
  source openembedded-core/oe-init-build-env
```
* Add the required dependencies by modifying ``./conf/bblayers.conf`` (adjust /home/me/devel as necessary):
```
  BBLAYERS ?= " \
    /home/me/OE/openembedded-core/meta \
    /home/me/OE/meta-openembedded/meta-oe \
    /home/me/OE/meta-openembedded/meta-networking \
    /home/me/OE/meta-openembedded/meta-python \
    /home/me/OE/meta-openembedded/meta-multimedia \
    /home/me/OE/meta-ros \
    /home/me/OE/meta-sunxi \
    /home/me/OE/meta-frobo \
```
* Set build configuration in ``./conf/local.conf``:
```
  MACHINE ??= "cubieboard2
  DL_DIR ?= "${TOPDIR}/downloads"
  #Use frobo distro
  DISTRO ?= "frobo"
  
  #Optimize space usage during build
  INHERIT += "rm_work"
  RM_WORK_EXCLUDE += ""
  
  #Set 100Mb extra free space
  IMAGE_ROOTFS_EXTRA_SPACE = "102400"
  
  #Enable PR service
  PRSERV_HOST = "localhost:0"
  
  #To allow pcl to build on a machine with little memory
  BB_NUMBER_THREADS ?= "1"
  PARALLEL_MAKE ?= "-j 1"
```
* Prepare WiFi
```
  cd meta-frobo/recipes-connectivity/wpa-supplicant/wpa-supplicant
  cp wpa_supplicant.conf-sane.template wpa_supplicant.conf-sane
  [edit wpa_supplicant.conf-sane with your WiFi AP info]
```
* Update ``meta-frobo/conf/distro/frobo.conf`` to set your feed-server, e.g.: 
```
  DISTRO_FEED_URI = "http://robo.local:4000"
```
* Build Image
```
  cd ~/OE
  source openembedded-core/oe-init-build-env
  bitbake core-image-frobo
```
* Write image to SD (replace /dev/sdb as required)
```
  cd ~/OE/build/tmp-glibc/deploy/images/cubieboard2
  sudo dd if=core-image-frobo-cubieboard2.sunxi-sdimg of=/dev/sdb bs=4096
  using gparted, resize base partition to max size
```  
* Connect via WiFi
```
  ssh root@frobo.local
```
* Debug via serial
```
  gtkterm -p [serial port] -s 115200
```

## FEED-SERVER

To update packages on the system after building the image, run the feed-server:

On your build machine:
* Prepare and start feed-server
```
  sudo apt-get install nodejs npm
  npm install express serve-index serve-static
  cp -r meta-frobo/support-files/feed-server OE
  cd OE/feed-server
  ./startFeedServer.sh
```

* Build package
```
  bitbake [package]
  bitbake package-index
```

On frobo:
```
  opkg update
  opkg install [package]
```
or
```
  opkg update
  opkg upgrade
```

## PATCHES

Please submit any patches against the frobo layer to the
the maintainer:

Maintainer: Kristof Robot <krirobo@gmail.com>
