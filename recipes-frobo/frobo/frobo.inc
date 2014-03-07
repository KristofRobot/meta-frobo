SRC_URI = "git://github.com/KristofRobot/frobo.git"
SRCREV = "eca6df8ebba7ab31d058badf59636ae19533cd43"
# Lookout for PV bump too when SRCREV is changed
PV = "1.0.2+git${SRCREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
