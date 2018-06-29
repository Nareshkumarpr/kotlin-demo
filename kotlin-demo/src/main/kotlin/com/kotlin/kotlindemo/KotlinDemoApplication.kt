package com.kotlin.kotlindemo

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class KotlinDemoApplication

private val log = LoggerFactory.getLogger(KotlinDemoApplication::class.java)

@Bean
fun init(repository: PersonRepository) = CommandLineRunner {
    repository.save(Person("Sachin", "Tendulkar"))
    repository.save(Person("Virat", "Kohli"))
    repository.findAll().forEach { log.info(it.toString()) }
}

fun main(args: Array<String>) {
    runApplication<KotlinDemoApplication>(*args)
}