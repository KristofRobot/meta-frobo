SRC_URI = "git://github.com/KristofRobot/frobo.git"
SRCREV = "0f8dbe7515e50d40ceec8e8d20a95fa3b1a3122a"
PV = "1.0.0+git${SRCREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
