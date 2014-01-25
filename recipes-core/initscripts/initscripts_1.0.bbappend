FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
# Don't forget to bump PRINC if you update the extra files.
PRINC = "1"

SRC_URI += "file://perftune.sh "

do_install_append () {
	install -m 0755    ${WORKDIR}/perftune.sh	${D}${sysconfdir}/init.d
	update-rc.d -r ${D} perftune.sh start 25 5 .
}
