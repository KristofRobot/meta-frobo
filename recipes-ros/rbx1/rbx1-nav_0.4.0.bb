DESCRIPTION = "ROS by Example Vol 1 Navigation Package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy roscpp geometry-msgs nav-msgs move-base-msgs visualization-msgs tf actionlib orocos-kdl dynamic-reconfigure"

require rbx1.inc

RRECOMMENDS_${PN} = "rospy roscpp geometry-msgs nav-msgs move-base-msgs visualization-msgs tf actionlib orocos-kdl dynamic-reconfigure"
