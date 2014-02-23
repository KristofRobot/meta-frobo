DESCRIPTION = "ROS Arduino Python"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dynamic-reconfigure"

require ros-arduino-bridge.inc

SRC_URI += "file://0001_disable_dynamic_reconfigure.patch"

RRECOMMENDS_${PN} = "std-msgs rospy sensor-msgs geometry-msgs nav-msgs tf ros-arduino-msgs python-pyserial dynamic-reconfigure"
