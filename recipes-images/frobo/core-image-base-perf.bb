DESCRIPTION = "A small image that fully supports the target device \
hardware, runs an openssh server, provides devel tools and benchmark tools"

IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"
IMAGE_FEATURES += "ssh-server-openssh package-management"

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL_append = " perf linpackc face-benchmark htop openssl nbench-byte lmbench"
