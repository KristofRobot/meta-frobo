SRC_URI = "git://github.com/KristofRobot/ros_arduino_bridge.git"
SRCREV = "4dbdc998bcc3c5a8c68d712bbd0e8d8b263b9c6b"
PV = "0.2.1+git${SRCREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
