SRC_URI = "git://github.com/KristofRobot/ros_arduino_bridge.git;branch=enhancedPID2"
SRCREV = "8ebe24bb9991572790a3ba5be5be3b1f7d1bd13f"
PV = "0.2.0+git${SRCREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
