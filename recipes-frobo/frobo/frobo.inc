SRC_URI = "git://github.com/KristofRobot/frobo.git"
SRCREV = "${AUTOREV}"
PV = "1.0.0+gitr${SRCPV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
