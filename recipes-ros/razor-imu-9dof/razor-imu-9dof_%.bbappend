FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://my_razor.yaml"

do_configure_prepend () {
    cp ${WORKDIR}/my_razor.yaml ${S}/config
}
