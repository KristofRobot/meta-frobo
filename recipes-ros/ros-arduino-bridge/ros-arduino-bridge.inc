SRC_URI = "git://github.com/KristofRobot/ros_arduino_bridge.git"
SRCREV = "d8596dbf9a401feae8ed062351647b9cfcf53cb1"
PV = "0.2.0+git${SRCREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
