
SUMMARY = "Dart web app installation"

DESCRIPTION = "This recipe consist of modifying nginx configuration \
			   to install dart web site on an embedded system."

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SECTION = "custom"

SRC_URI = " \
    file://dart_server.site \
"

do_install() {
	install -Dm 0644 ${WORKDIR}/dart_server.site ${D}${sysconfdir}/nginx/sites-available/dart_server
	sed -i 's,/var/,${localstatedir}/,g' ${D}${sysconfdir}/nginx/sites-available/dart_server
	install -d ${D}${sysconfdir}/nginx/sites-enabled
	ln -s ../sites-available/dart_server ${D}${sysconfdir}/nginx/sites-enabled/
}
