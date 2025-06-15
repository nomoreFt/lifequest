package com.example.lifequest.user.domain

import com.kotlin.lifequest.shared.domain.BaseRootEntity
import com.kotlin.lifequest.user.domain.Experience
import com.kotlin.lifequest.user.domain.Password
import com.kotlin.lifequest.user.domain.Stats
import com.kotlin.lifequest.user.domain.UserInformation
import java.time.LocalDate
import jakarta.persistence.*

@Entity
class User(
    @Embedded
    var information: UserInformation,

    @Embedded
    var stats: Stats = Stats(),    // RPG 스탯 VO

    @Embedded
    var exp: Experience = Experience(), // 경험치 VO

    @AttributeOverride(name = "value", column = Column(name = "password", nullable = false))
    @Embedded
    var password: Password,

    id: Long = 0L
) : BaseRootEntity<User>(id) {

    val name: String get() = information.name

    /**
     * 도메인 행위
     */
/*    fun gainExp(amount: Int) {
        exp = exp.add(amount)
        if (exp.isLevelUp()) {
            stats = stats.levelUp()
            registerEvent(LevelUpEvent(id, name, stats))
        }
    }*/

/*    fun completeQuest(quest: Quest) {
        // 검증
        if (!quest.canComplete()) throw IllegalStateException("아직 완료 조건이 아님")
        gainExp(quest.expReward)
        registerEvent(QuestCompletedEvent(id, quest.id, quest.name))
    }*/
}