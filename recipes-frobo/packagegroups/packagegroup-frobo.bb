DESCRIPTION = "frobo package group"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = "\
	roslaunch \
	frobo-bringup \
	rostopic \
	rosbag \
	sound-play \
	alsa-utils \
	ros-pocketsphinx \
	xauth \
	"
