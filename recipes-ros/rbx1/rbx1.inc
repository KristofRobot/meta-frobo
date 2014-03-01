SRC_URI = "git://github.com/pirobot/rbx1.git;branch=hydro-devel"
SRCREV = "7f4b69b0b2cd05a000577d58cca37bf5b87d9cde"
PV = "0.4.0+git${SRCREV}"

S = "${WORKDIR}/git/${ROS_BPN}"

inherit catkin
