FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://launch"

do_configure_prepend () {
    cp ${WORKDIR}/launch/* ${S}/launch
}
