DESCRIPTION = "frobo_description provides a model of Frobo for simulation and visualization"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "urdf xacro"

require frobo.inc

RRECOMMENDS_${PN} = "urdf xacro"
