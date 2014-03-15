DESCRIPTION = "A driver for the razor board and a 3D display node."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-msgs"

SRCREV = "e4b22486b7b7230c5b469e15a1eebe8cce1630ec"
PV = "1.0.1+git${SRCREV}"

SRC_URI = "git://github.com/KristofRobot/razor_imu_9dof.git"

SRC_URI += "file://razor-pub.launch \ 
	file://razor-pub-and-display.launch \
	"

S = "${WORKDIR}/git/razor_imu_9dof"

inherit catkin

#install custom frobo files
do_configure_prepend(){
	install -m 0644 ${WORKDIR}/razor-pub.launch ${S}/launch/
	install -m 0644 ${WORKDIR}/razor-pub-and-display.launch ${S}/launch/
}

RRECOMMENDS_${PN} = "rospy tf roscpp std-msgs"
