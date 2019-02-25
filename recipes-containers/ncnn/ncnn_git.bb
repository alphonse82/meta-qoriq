DESCRIPTION = "ncnn is a high-performance neural network inference framework optimized for the mobile platform"
HOMEPAGE = "https://github.com/Tencent/ncnn"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8c8b5b19ef89ee9cfa47e768aa904935"
SECTION = "libs"

SRC_URI = "git://github.com/Tencent/ncnn.git \
           "
SRCREV = "24f423b0c6791464d32a9b566754db6399c34da6"

S = "${WORKDIR}/git"

inherit cmake

