FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
# Don't forget to bump PRINC if you update the extra files.
PRINC = "4"

SRC_URI += "file://robot_pose_ekf.launch"

do_install_append () {
	install -d ${D}${datadir}/${ROS_BPN}/launch
	install -m 0644 ${WORKDIR}/robot_pose_ekf.launch ${D}${datadir}/${ROS_BPN}/launch/
}
