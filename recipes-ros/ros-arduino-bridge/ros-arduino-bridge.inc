SRC_URI = "git://github.com/KristofRobot/ros_arduino_bridge.git;branch=enhancedPID2"
SRCREV = "b6e601a13bddad28386117b5ba67af9c8db3c7f4"
PV = "1.0.0+git${SRCREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
