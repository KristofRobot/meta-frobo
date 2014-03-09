SRC_URI = "git://github.com/KristofRobot/ros_arduino_bridge.git"
SRCREV = "5f86067fd3f38290e5817aaa7d7349b705414d1d"
PV = "0.2.0+git${SRCREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
