package com.kotlin.kotlindemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * @author Radhakrishnan, Naresh Kumar (1388162)
 */
@RestController
class PersonController(private val repository: PersonRepository){

    @GetMapping("/persons")
    fun findAll() = repository.findAll()

    @GetMapping("/persons/{firstName}")
    fun findOne(@PathVariable firstName: String ) = repository.findByFirstName(firstName)
}

