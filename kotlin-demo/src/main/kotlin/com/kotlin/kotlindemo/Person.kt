package com.kotlin.kotlindemo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * @author Radhakrishnan, Naresh Kumar (1388162)
 */
@Entity
data class Person(
        val firstName: String,
        val lastName: String,
        @Id @GeneratedValue
        val id: Long = -1
)