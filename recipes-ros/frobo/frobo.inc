SRC_URI = "git://github.com/KristofRobot/frobo.git"
SRCREV = "dda5122f96229ae6ea2a258ca03e50e1b4c4546d"
PV = "1.0.0+git${SRCREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
