DESCRIPTION = "Linpack C benchmark, calculates FLOPS."
SECTION = "benchmark"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${PN}.c;md5=1c5d0b6a31264685d2e651c920e3cdf4"
PR = "r0"

SRC_URI = "http://www.netlib.org/benchmark/${PN}.new;downloadfilename=${PN}.c"
SRC_URI[md5sum] = "1c5d0b6a31264685d2e651c920e3cdf4"
SRC_URI[sha256sum] = "a63f2ec86512959f1fd926bfafb85905b2d7b7402942ffae3af374d48745e97e"

S = "${WORKDIR}"

do_compile() {
    ${CC} ${CFLAGS} ${PN}.c -o ${PN}
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${PN} ${D}${bindir}
}

