package com.mercadolivre.spring

import org.junit.Test

class TalkApplicationTests {

	@Test
	fun contextLoads() {
		app.run(profiles = "test")
	}

}
