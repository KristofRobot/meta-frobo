FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
# Don't forget to bump PRINC if you update the extra files.
PRINC = "1"

SRC_URI += "file://cubieboard2.fex"
SUNXI_FEX_FILE_cubieboard2 = "../cubieboard2.fex"
