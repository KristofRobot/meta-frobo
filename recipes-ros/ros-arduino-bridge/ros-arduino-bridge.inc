SRC_URI = "git://github.com/KristofRobot/ros_arduino_bridge.git"
SRCREV = "6ae140986e61eb88b88ccd5cbeb25a766f705d6f"
PV = "0.2.2+git${SRCREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
