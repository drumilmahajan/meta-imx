DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=e565271ec9a80ce47abbddc4bffe56fa"

SRC_URI[arm-fb.md5sum] = "073eeb4d380a9ebac47834859e2c89fd"
SRC_URI[arm-fb.sha256sum] = "b68a521500eb010e130358c6a0419ca4532dcb005263f85a5139021cf21d5a9e"

SRC_URI[arm-wayland.md5sum] = "29109b205d6e707f87ae15dc04c3ada6"
SRC_URI[arm-wayland.sha256sum] = "3c5b182b9d3668de2efd7416a17dc33c52386dbd0943414aa5213fcb0aaa0e38"

SRC_URI[arm-x11.md5sum] = "62788042779d29e9f69931f607c79826"
SRC_URI[arm-x11.sha256sum] = "35fb8d4fb54e0a64d783ee0d602c42b5bc1511f0c8dd4a0946a287cf6247f80b"

SRC_URI[aarch64-fb.md5sum] = "20418e096f1bb09438ac415f9e3be39c"
SRC_URI[aarch64-fb.sha256sum] = "6ec2e02225afd113d9693c1ce6723f3b8890593198f22793a9c0396b8c45b1b6"

SRC_URI[aarch64-wayland.md5sum] = "4f8f480c0078ff6bf68fac8c6308737c"
SRC_URI[aarch64-wayland.sha256sum] = "fb1ee68d5ecb6c5d07af4ea421c09fd4edd6565d3db5bb5d3bde7018d36888db"

SRC_URI[aarch64-x11.md5sum] = "bb862e55b8ee79ee5a83b0119618cd07"
SRC_URI[aarch64-x11.sha256sum] = "85c1b51d33e5939600af311d509191387b864db2e0b55e11347b93831e662228"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
