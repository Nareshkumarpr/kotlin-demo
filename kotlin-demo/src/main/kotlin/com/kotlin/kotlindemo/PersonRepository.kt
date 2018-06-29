package com.kotlin.kotlindemo

import org.springframework.data.repository.CrudRepository

/**
 * @author Radhakrishnan, Naresh Kumar (1388162)
 */
interface PersonRepository : CrudRepository<Person, Long> {
    fun findByFirstName(lastName: String): Iterable<Person>
}