package com.mercadolivre.spring

import org.springframework.fu.kofu.web.server
import org.springframework.fu.kofu.webApplication

fun main() {
    app.run()
}

val app = webApplication {
    server {
        router {
            GET("/") {
                ok().syncBody("SUP!")
            }
        }
    }
}