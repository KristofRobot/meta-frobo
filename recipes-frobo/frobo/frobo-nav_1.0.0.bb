DESCRIPTION = "Frobo Navigation Package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp rospy geometry-msgs nav-msgs move-base-msgs visualization-msgs tf actionlib orocos-kdl dynamic-reconfigure"

require frobo.inc

RRECOMMENDS_${PN} = "roscpp rospy geometry-msgs nav-msgs move-base-msgs visualization-msgs tf actionlib orocos-kdl dynamic-reconfigure"
