DESCRIPTION = "frobo package group"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = "\
	frobo-bringup \
	frobo-nav \
	"
