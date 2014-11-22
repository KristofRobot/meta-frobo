FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://robot_pose_ekf.launch"

do_install_append () {
	install -d ${D}${ros_datadir}/${ROS_BPN}/launch
	install -m 0644 ${WORKDIR}/robot_pose_ekf.launch ${D}${ros_datadir}/${ROS_BPN}/launch/
}
