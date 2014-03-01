DESCRIPTION = "Frobo Startup Package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

require frobo.inc

RRECOMMENDS_${PN} = "frobo-description freenect-launch depthimage-to-laserscan"
