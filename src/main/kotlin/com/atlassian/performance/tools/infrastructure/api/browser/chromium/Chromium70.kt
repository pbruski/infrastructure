package com.atlassian.performance.tools.infrastructure.api.browser.chromium

import com.atlassian.performance.tools.infrastructure.Chromedriver
import com.atlassian.performance.tools.infrastructure.ChromiumInstaller
import com.atlassian.performance.tools.infrastructure.api.browser.Browser
import com.atlassian.performance.tools.ssh.api.SshConnection
import java.net.URI

class Chromium70 : Browser {
    private val uri = URI("https://www.googleapis.com/download/storage/v1/b/chromium-browser-snapshots/o/Linux_x64%2F587811%2Fchrome-linux.zip?generation=1535668921668411&alt=media")

    /**
     * Installs chromium 69 with a compatible chromedriver.
     */
    override fun install(ssh: SshConnection) {
        ChromiumInstaller(uri).install(ssh)
        Chromedriver("2.43").install(ssh)
    }
}