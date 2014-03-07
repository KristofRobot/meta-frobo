SRC_URI = "git://github.com/KristofRobot/ros_arduino_bridge.git;branch=enhancedPID2"
SRCREV = "a562349319ef98fa2458bc3e4edecbf942bd76a9"
PV = "0.2.0+git${SRCREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
