DESCRIPTION = "A small image that fully supports the target device \
hardware, runs an openssh server and glmark2 benchmark."

IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL} glmark2"
IMAGE_FEATURES += "ssh-server-openssh package-management"

LICENSE = "MIT"

inherit core-image
