LINUX_VERSION_EXTENSION ?= "-adv7511-bistromath"
PV = "${LINUX_VERSION}${LINUX_VERSION_EXTENSION}+git${SRCPV}"

inherit kernel
require recipes-kernel/linux/linux-yocto.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI = " \
    git://github.com/analogdevicesinc/linux.git;protocol=https;branch=2018_R2 \
    file://video.cfg \
    "

DESCRIPTION = "Analog devices kernel"

# FIXME Use upstream defconfig
# KBUILD_DEFCONFIG_zedboard-zynq7-adv7511 = "zynq_xcomm_adv7511_defconfig"
# KCONFIG_MODE_zedboard_zynq7-adv7511 = "--alldefconfig"

LINUX_VERSION = "4.14.0"
LINUX_VERSION_EXTENSION = "-adi"

SRCREV_zedboard-zynq7-adv7511 = "8e15598a78781b4bdd731b1876eb6e38496bbba8"

COMPATIBLE_MACHINE = "zedboard-zynq7-adv7511"
