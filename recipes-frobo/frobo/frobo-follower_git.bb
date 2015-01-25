DESCRIPTION = "Frobo Apps Package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "nodelet pcl-ros roscpp visualization-msgs"

require frobo.inc

RRECOMMENDS_${PN} = "frobo-bringup dynamic-reconfigure"
