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
	install -m 0755 ${S}/scripts/connectArduino.sh ${D}/scripts/
	install -m 0755 ${S}/scripts/kinectStart.sh ${D}/scripts/
	install -m 0755 ${S}/scripts/mapStart.sh ${D}/scripts/
	install -m 0755 ${S}/scripts/patrol.sh ${D}/scripts/
	install -m 0755 ${S}/scripts/laserStart.sh ${D}/scripts/
}

FILES_${PN} += "/scripts/*"

RRECOMMENDS_${PN} = "frobo-description freenect-launch depthimage-to-laserscan"
