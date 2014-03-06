SRC_URI = "git://github.com/KristofRobot/frobo.git"
SRCREV = "090238104faad1cca956cfbe1eeab5b152244d18"
# Lookout for PV bump too when SRCREV is changed
PV = "1.0.1+git${SRCREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
