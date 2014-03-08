SRC_URI = "git://github.com/KristofRobot/frobo.git"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
