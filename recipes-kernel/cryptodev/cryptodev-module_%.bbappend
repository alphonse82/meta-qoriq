inherit qoriq_build_64bit_kernel
FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

SRC_URI += "file://0001-cryptodev_verbosity-Fix-build-for-Linux-6.4.patch "
