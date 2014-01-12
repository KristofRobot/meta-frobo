DESCRIPTION = "A small image that fully supports the target device \
hardware, runs an openssh server, provides devel tools and benchmark tools"

#IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL} openssl nbench-byte lmbench glmark2 xauth xeyes roslaunch rostopic cv-bridge python-opencv rosbag packagegroup-core-buildessential packagegroup-core-tools-profile wpa-supplicant wireless-tools usbutils"
IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL} roslaunch rostopic cv-bridge python-opencv rosbag python-numpy rospy perf"
IMAGE_FEATURES += "ssh-server-openssh package-management"

LICENSE = "MIT"

inherit core-image
