FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
# Don't forget to bump PRINC if you update the extra files.
PRINC = "1"

SRC_URI += "\
	file://99-frobo.rules \
	"

do_install_append() {
    install -d ${D}${sysconfdir}/udev/rules.d
    install -m 0644 ${WORKDIR}/99-frobo.rules ${D}${sysconfdir}/udev/rules.d/
}
