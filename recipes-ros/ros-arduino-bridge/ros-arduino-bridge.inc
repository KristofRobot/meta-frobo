SRC_URI = "git://github.com/KristofRobot/ros_arduino_bridge.git;branch=enhancedPID2"
SRCREV = "839365bf23c66b15281e07c979f24991ab82b5e9"
PV = "0.2.0+git${SRCREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
