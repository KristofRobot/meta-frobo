FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"
# Don't forget to bump PRINC if you update the extra files.
PRINC = "1"

SRC_URI += "file://0001_disable_points_xyz.patch"
