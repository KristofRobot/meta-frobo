DESCRIPTION = "razor_imu_9dof is a package on driver for the razor board and 3D display node."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-msgs"

SRC_URI = "git://github.com/KristofRobot/razor_imu_9dof.git"
SRCREV = "1c2b77e8c06b5be5b4e9c08ae1858f8b72507c11"
PV = "1.0.0+git${SRCREV}"

S = "${WORKDIR}/git/razor_imu_9dof"

inherit catkin

RRECOMMENDS_${PN} = "rospy tf roscpp std-msgs"
