SRC_URI = "git://github.com/KristofRobot/frobo.git"
SRCREV = "f674e205665a3b0360afd0114b870550710a9a5e"
PV = "1.0.0+git${SRCREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
