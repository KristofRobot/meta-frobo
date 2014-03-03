DESCRIPTION = "A base image that fully supports the target device \
hardware and provides all distro packages"

#By not defining IMAGE_INSTALL, 
#falling back to defaults in core-image.bbclass, i.e.:
#IMAGE_INSTALL = '\
#    packagegroup-core-boot \
#    packagegroup-base-extended \
#    \
#    ${CORE_IMAGE_EXTRA_INSTALL} \
#    '

LICENSE = "MIT"

inherit core-image
