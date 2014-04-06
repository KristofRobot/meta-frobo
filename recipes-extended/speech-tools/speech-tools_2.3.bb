DESCRIPTION = "The Edinburgh Speech Tools Library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README;md5=9fe1b4db906b7d75f821c72a358638fd"

SRC_URI = "http://tts.speech.cs.cmu.edu/awb/20130703/speech_tools-${PV}-current.tar.gz"
SRC_URI[md5sum] = "02863b3ead04a0ade65982a1f34a60bb"
SRC_URI[sha256sum] = "75e203402483b78de635943671aaf6f86cb6f9bf181fc84a931c2a560ade6a7c"

S = "${WORKDIR}/speech_tools"

inherit autotools
