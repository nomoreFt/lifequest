package com.kotlin.lifequest.user.domain

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
data class Stats(
    @Column(nullable = false)
    val strength: Int = 5,
    @Column(nullable = false)
    val intelligence: Int = 5,
    @Column(nullable = false)
    val dexterity: Int = 5
) {
    fun levelUp(): Stats =
        copy(strength = strength + 1, intelligence = intelligence + 1, dexterity = dexterity + 1)
}