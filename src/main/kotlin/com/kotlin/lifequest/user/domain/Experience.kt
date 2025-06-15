package com.kotlin.lifequest.user.domain

import jakarta.persistence.Column
import jakarta.persistence.Embeddable

@Embeddable
data class Experience(
    @Column(nullable = false)
    val value: Int = 0
) {
    fun add(amount: Int) = copy(value = value + amount)
    fun isLevelUp(): Boolean = value >= 100  // 예시
}