package com.example.models.jpa

import jakarta.persistence.*

@Entity
@Table(name = "user")
open class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long? = null

    @Column(nullable = false)
    var username: String = ""

    @Column(nullable = false)
    var password: String = ""
}