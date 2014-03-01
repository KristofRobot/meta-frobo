DESCRIPTION = "frobo package group"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = "\
	frobo-bringup \
	frobo-nav \
	razor-imu-9dof \
	ros-arduino-bridge \
	ros-arduino-python \
	xv-11-laser-driver \
	"
