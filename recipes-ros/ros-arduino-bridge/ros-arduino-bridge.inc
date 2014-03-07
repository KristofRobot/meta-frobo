SRC_URI = "git://github.com/KristofRobot/ros_arduino_bridge.git;branch=enhancedPID2"
SRCREV = "ee0200b0489821d724c8084b3a1d6ddf70684f3b"
PV = "1.0.1+git${SRCREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
