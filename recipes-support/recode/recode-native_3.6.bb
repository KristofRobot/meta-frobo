#LICENSE = "GPLv2"
#LIC_FILES_CHKSUM = "file://COPYING;md5=a52a18a472d4f7e45479b06563717c02"

require recode_${PV}.bb

inherit native

S = "${WORKDIR}/recode-${PV}/"

SRC_URI[md5sum] = "be3f40ad2e93dae5cd5f628264bf1877"
SRC_URI[sha256sum] = "e3e6a4f3f8e5c6052ab70155990c074d87aa0b614fc1be31d194750d1d962fcf"
