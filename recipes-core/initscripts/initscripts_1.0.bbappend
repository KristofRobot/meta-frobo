FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
# Don't forget to bump PRINC if you update the extra files.
PRINC = "1"

SRC_URI += "file://cpufreq.sh "

do_install_append () {
	install -m 0755    ${WORKDIR}/cpufreq.sh	${D}${sysconfdir}/init.d
	update-rc.d -r ${D} cpufreq.sh start 25 5 .
}
