inherit kernel
require recipes-kernel/linux/linux-yocto.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI = " \
    git://github.com/analogdevicesinc/linux.git;protocol=https;branch=2015_R2 \
    file://defconfig \
    "

# FIXME Use upstream defconfig
# KBUILD_DEFCONFIG_zedboard-zynq7-adv7511 = "zynq_xcomm_adv7511_defconfig"
# KCONFIG_MODE_zedboard_zynq7-adv7511 = "--alldefconfig"

LINUX_VERSION = "4.0.0"
LINUX_VERSION_EXTENSION = "-adi"

SRCREV_zedboard-zynq7-adv7511 = "fc44245a5579df22f0490859967d29e912ee169e"

PV = "${LINUX_VERSION}${LINUX_VERSION_EXTENSION}+git${SRCPV}"

COMPATIBLE_MACHINE = "zedboard-zynq7-adv7511"
