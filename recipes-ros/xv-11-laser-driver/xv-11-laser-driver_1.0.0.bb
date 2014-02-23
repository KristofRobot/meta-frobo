DESCRIPTION = "Neato XV-11 Laser Driver. This driver works with the laser when it is removed from the XV-11 Robot as opposed to reading scans from the Neato's USB port."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost sensor-msgs roscpp"

SRC_URI = "git://github.com/KristofRobot/cwru-ros-pkg.git"
SRCREV = "28d7870a97779747a1c9c5a43eec820f9ac7b026"
PV = "1.0.0+git${SRCREV}"

S = "${WORKDIR}/git/cwru_semi_stable/xv_11_laser_driver"

inherit catkin
