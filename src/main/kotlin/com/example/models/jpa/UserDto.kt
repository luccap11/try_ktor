package com.example.models.jpa

import jakarta.persistence.*

@Entity
@Table(name = "'user'")//costretto ad aggiungere le ' perche user è una parola riservata per H2
class UserDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    var id: Long? = null

    @Column(nullable = false)
    var username: String = ""

    @Column(nullable = false)
    var password: String = ""

//    override fun equals(other: Any?): Boolean {
//        if (this === other) return true
//        if (other == null || javaClass != other.javaClass) return false
//        val that = other as UserDto
//        if (id != that.id) return false
//        return true
//    }
//
//    override fun hashCode(): Int {
//        return if (id != null)
//            id.hashCode()
//        else 0
//    }

}