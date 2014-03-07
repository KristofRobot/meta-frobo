DESCRIPTION = "ROS Arduino Python"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "dynamic-reconfigure"

require ros-arduino-bridge.inc

SRC_URI += "\
	file://frobo_arduino_params.yaml \
	file://arduino.launch \
	"

#install custom frobo files
do_configure_prepend(){
	install -m 0644 ${WORKDIR}/frobo_arduino_params.yaml ${S}/config/
	install -m 0644 ${WORKDIR}/arduino.launch ${S}/launch/
}

RRECOMMENDS_${PN} = "std-msgs rospy sensor-msgs geometry-msgs nav-msgs tf ros-arduino-msgs python-pyserial dynamic-reconfigure"
