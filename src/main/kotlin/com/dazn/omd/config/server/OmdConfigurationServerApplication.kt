package com.dazn.omd.config.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class OmdConfigurationServerApplication

fun main(args: Array<String>) {
	runApplication<OmdConfigurationServerApplication>(*args)
}
