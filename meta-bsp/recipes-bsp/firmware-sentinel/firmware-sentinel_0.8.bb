# Copyright 2021-2022 NXP
SUMMARY = "NXP i.MX Sentinel firmware"
DESCRIPTION = "Firmware for i.MX Sentinel Security Controller"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5a0bf11f745e68024f37b4724a5364fe" 

inherit fsl-eula-unpack use-imx-security-controller-firmware deploy

SRC_URI = "${FSL_MIRROR}/${BP}.bin;fsl-eula=true"
SRC_URI[md5sum] = "17abb52bf08fc64861c6fa33198a3060"
SRC_URI[sha256sum] = "d7d284d5fcfc3ad2aa0ae9623e9cd18351b1067765c64fcc9bd8862eab0ff084"

do_compile[noexec] = "1"

do_install() {
}

do_deploy () {
    # Deploy the related firmware to be package by imx-boot
    install -m 0644 ${S}/${SECO_FIRMWARE_NAME}  ${DEPLOYDIR}
}
addtask deploy after do_install before do_build

COMPATIBLE_MACHINE = "(mx8ulp-nxp-bsp|mx9-nxp-bsp)"