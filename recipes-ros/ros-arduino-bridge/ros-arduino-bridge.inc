DESCRIPTION="Metapackage for core of ros arduino bridge - enhancedPID version"

SRC_URI = "git://github.com/KristofRobot/ros_arduino_bridge.git;branch=enhancedPID2"
SRCREV = "b6e601a13bddad28386117b5ba67af9c8db3c7f4"
PV = "1.0.0+git${SRCREV}"

SRC_URI[md5sum] = "d234de3059d1fd14578c6ba2dfef194e"
SRC_URI[sha256sum] = "a637b77e9122d0d77bb5946d1f50d3411ba370cc367ce2a3efe4fb1bb22e0879"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
