FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://robot_pose_ekf.launch"

do_install_append () {
	install -d ${D}${datadir}/${ROS_BPN}/launch
	install -m 0644 ${WORKDIR}/robot_pose_ekf.launch ${D}${datadir}/${ROS_BPN}/launch/
}
