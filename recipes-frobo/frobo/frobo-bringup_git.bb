DESCRIPTION = "Frobo Startup Package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

require frobo.inc

#put robot scripts in /scripts directory
do_install_append(){
        install -d ${D}/scripts
	install -m 0755 ${S}/scripts/robotStart.sh ${D}/scripts/
	install -m 0755 ${S}/scripts/connectArduinoMotor.sh ${D}/scripts/
	install -m 0755 ${S}/scripts/kinectStart.sh ${D}/scripts/
	install -m 0755 ${S}/scripts/follower.sh ${D}/scripts/
	install -m 0755 ${S}/scripts/mapStart.sh ${D}/scripts/
	install -m 0755 ${S}/scripts/patrol.sh ${D}/scripts/
	install -m 0755 ${S}/scripts/kinectLaserStart.sh ${D}/scripts/
	install -m 0755 ${S}/scripts/stallDetection.sh ${D}/scripts/
	install -m 0755 ${S}/scripts/talk.sh ${D}/scripts/
	install -m 0755 ${S}/scripts/talkback.sh ${D}/scripts/
	install -m 0755 ${S}/scripts/laserStart.sh ${D}/scripts/
	install -m 0755 ${S}/scripts/imuStart.sh ${D}/scripts/
	install -m 0755 ${S}/scripts/sonarStart.sh ${D}/scripts/
	install -m 0755 ${S}/scripts/ntp.sh ${D}/scripts/
	
	#add README
	install -m 0644 ${S}/README.md ${D}/scripts/
}

FILES_${PN} += "/scripts/*"

RDEPENDS_${PN} = " \
	roslaunch \
	frobo-description \
	frobo-nav \
	frobo-speech \
	frobo-vision \
	frobo-apps \
	frobo-follower \
	freenect-launch \
	depthimage-to-laserscan \
	rosbash \
	robot-state-publisher \
	joint-state-publisher \
	razor-imu-9dof \
	ros-arduino-bridge \
	ros-arduino-python \
	xv-11-laser-driver \
	map-server \
	move-base \
	amcl \
	robot-pose-ekf \
	udev-extraconf \
	rosserial-python \
	"

RRECOMMENDS_${PN} = " \
	picocom \
	ntpdate \
	"
