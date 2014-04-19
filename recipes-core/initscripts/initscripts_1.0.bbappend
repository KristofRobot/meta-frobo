FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://perftune.sh file://powerbutton.sh file://powerbuttonmonitor.sh"

do_install_append () {
	install -m 0755    ${WORKDIR}/perftune.sh	${D}${sysconfdir}/init.d
	update-rc.d -r ${D} perftune.sh start 25 5 .

	install -d ${D}${bindir}
	install -m 0755    ${WORKDIR}/powerbuttonmonitor.sh	${D}${bindir}
	install -m 0755    ${WORKDIR}/powerbutton.sh	${D}${sysconfdir}/init.d
	update-rc.d -r ${D} powerbutton.sh start 99 5 .
}
