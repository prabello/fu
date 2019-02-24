package com.mercadolivre.spring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TalkApplication

fun main(args: Array<String>) {
	runApplication<TalkApplication>(*args)
}
