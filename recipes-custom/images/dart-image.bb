SUMMARY = "A console-only image that fully supports the target device \
hardware."

IMAGE_FEATURES += "ssh-server-dropbear"
IMAGE_INSTALL_append = " inetutils"
IMAGE_INSTALL_append = " nginx"

IMAGE_INSTALL_append = " dart-web"

LICENSE = "MIT"

inherit core-image
