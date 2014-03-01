SRC_URI = "git://github.com/KristofRobot/frobo.git"
SRCREV = "f05a7dcb73bd864338fa9a75445c20738b4800d3"
PV = "1.0.0+git${SRCREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
