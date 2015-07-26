This is a layer to build frobo, a differential drive ROS-based robot, in an OpenEmbedded Linux system.

Please see the corresponding sections below for details.

## BUILD

To build an image that can be directly used on frobo:

* Prepare WiFi
```
  cd meta-frobo/recipes-connectivity/wpa-supplicant/wpa-supplicant
  cp wpa_supplicant.conf-sane.template wpa_supplicant.conf-sane
  [edit wpa_supplicant.conf-sane with your WiFi AP info]
```

* Build Image
```
  bitbake core-image-frobo
  sudo dd if=core-image-frobo of=/dev/mmcblk0 bs=4096
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

## PATCHES

Please submit any patches against the frobo layer to the
the maintainer:

Maintainer: Kristof Robot <krirobo@gmail.com>
