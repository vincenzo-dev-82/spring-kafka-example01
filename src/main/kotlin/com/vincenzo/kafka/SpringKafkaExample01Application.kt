package com.vincenzo.kafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKafkaExample01Application

fun main(args: Array<String>) {
    runApplication<SpringKafkaExample01Application>(*args)
}
