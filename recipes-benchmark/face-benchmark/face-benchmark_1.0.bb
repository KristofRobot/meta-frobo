DESCRIPTION = "Face tracker benchmark."
SECTION = "benchmark"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;md5=3c9cd0c1e976eed375c38e59bb7b7741"
PR = "r1"

SRC_URI = "git://github.com/pirobot/rbx1.git"
SRCREV = "8a746f6daecf59b72c0cce0c2ffa0327a20f65bd"
PV = "1.0+git${SRCREV}"
SRC_URI[md5sum] = "7c70b13d3057c21cfd3ff0d66e395d20"
SRC_URI[sha256sum] = "0789b724cfd9bf1804c8cf166610119ac9d306d71f1a90ab398b791f13e35c57"

S = "${WORKDIR}/git"

FILES_${PN} += "/rbx1_vision/rbx1_vision/* /home/root/ros_workspace/rbx1_vision/*"

do_install() {
    install -d ${D}/rbx1_vision/rbx1_vision
    install -m 0755 ${S}/rbx1_vision/src/rbx1_vision/* ${D}/rbx1_vision/rbx1_vision 

    install -d ${D}/home/root/ros_workspace/rbx1_vision/scripts/test_images
    install -d ${D}/home/root/ros_workspace/rbx1_vision/data/haar_detectors
    install -d ${D}/home/root/ros_workspace/rbx1_vision/data/templates/faces/mona_live
    install -d ${D}/home/root/ros_workspace/rbx1_vision/data/templates/ros
    install -d ${D}/home/root/ros_workspace/rbx1_vision/videos
    install -d ${D}/home/root/ros_workspace/rbx1_vision/launch/includes
    install -d ${D}/home/root/ros_workspace/rbx1_vision/nodes
    install -m 0644 ${S}/rbx1_vision/scripts/test_images/* ${D}/home/root/ros_workspace/rbx1_vision/scripts/test_images/
    install -m 0755 ${S}/rbx1_vision/scripts/*.py ${D}/home/root/ros_workspace/rbx1_vision/scripts/ 
    install -m 0644 ${S}/rbx1_vision/data/haar_detectors/* ${D}/home/root/ros_workspace/rbx1_vision/data/haar_detectors/ 
    install -m 0644 ${S}/rbx1_vision/data/templates/ros/* ${D}/home/root/ros_workspace/rbx1_vision/data/templates/ros/ 
    install -m 0644 ${S}/rbx1_vision/data/templates/faces/*.jpg ${D}/home/root/ros_workspace/rbx1_vision/data/templates/faces/ 
    install -m 0644 ${S}/rbx1_vision/data/templates/faces/mona_live/* ${D}/home/root/ros_workspace/rbx1_vision/data/templates/faces/mona_live/ 
    install -m 0644 ${S}/rbx1_vision/videos/* ${D}/home/root/ros_workspace/rbx1_vision/videos/ 
    install -m 0755 ${S}/rbx1_vision/launch/*.launch ${D}/home/root/ros_workspace/rbx1_vision/launch/ 
    install -m 0755 ${S}/rbx1_vision/launch/includes/* ${D}/home/root/ros_workspace/rbx1_vision/launch/includes/ 
    install -m 0755 ${S}/rbx1_vision/nodes/* ${D}/home/root/ros_workspace/rbx1_vision/nodes/
    install -m 0755 ${S}/rbx1_vision/package.xml ${D}/home/root/ros_workspace/rbx1_vision/ 
}

RDEPENDS_${PN} += "roslaunch rosbash cv-bridge python-opencv rosbag python-numpy rospy sensor-msgs geometry-msgs rostest rosunit rostopic"
