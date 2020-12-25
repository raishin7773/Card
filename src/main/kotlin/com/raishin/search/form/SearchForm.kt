package com.raishin.search.form

import com.raishin.search.constants.AttributeConstants
import com.raishin.search.constants.LevelConstants
import com.raishin.search.constants.RaceConstants
import com.raishin.search.constants.TypeConstants
import com.raishin.search.emtity.DatasEntity

class SearchForm {
    var name: String = ""
    var type: Long? = null
    var typeDetail: Long? = null
    var atk: Long? = null
    var def: Long? = null
    var sum: Long? = null
    var attribute: Long? = null
    var race: Long? = null
    var level: Long? = null
    var levelFrom: Long? = null
    var levelTo: Long? = null
    var description: String = ""
    var cardList: List<DatasEntity> = mutableListOf()

    fun getTypeList(): List<Long> {
        if (type == 1L) {
            return TypeConstants.monsterList
        }
        if (type == 2L) {
            return TypeConstants.magicList
        }
        if (type == 3L) {
            return TypeConstants.trapList
        }
        return mutableListOf()
    }

    fun getLevelDisplay(level: Long): Long? {
        if (level <= 12) return level
        return when {
            level - LevelConstants.P1.value in 0..12 -> {
                level - LevelConstants.P1.value
            }
            level - LevelConstants.P2.value in 0..12 -> {
                level - LevelConstants.P2.value
            }
            level - LevelConstants.P3.value in 0..12 -> {
                level - LevelConstants.P3.value
            }
            level - LevelConstants.P4.value in 0..12 -> {
                level - LevelConstants.P4.value
            }
            level - LevelConstants.P5.value in 0..12 -> {
                level - LevelConstants.P5.value
            }
            level - LevelConstants.P6.value in 0..12 -> {
                level - LevelConstants.P6.value
            }
            level - LevelConstants.P7.value in 0..12 -> {
                level - LevelConstants.P7.value
            }
            level - LevelConstants.P8.value in 0..12 -> {
                level - LevelConstants.P8.value
            }
            level - LevelConstants.P9.value in 0..12 -> {
                level - LevelConstants.P9.value
            }
            level - LevelConstants.P10.value in 0..12 -> {
                level - LevelConstants.P10.value
            }
            level - LevelConstants.P11.value in 0..12 -> {
                level - LevelConstants.P11.value
            }
            level - LevelConstants.P12.value in 0..12 -> {
                level - LevelConstants.P12.value
            }
            else -> level
        }
    }

    fun getTypeMap(): Map<String, Long> {
        return mapOf("モンスター" to 1L, "魔法" to 2L, "罠" to 3L)
    }

    fun getAttributeMap(): Map<Long, String> {
        val maps = mutableMapOf<Long, String>()
        AttributeConstants.values().forEach { maps[it.value] = it.displayName }
        return maps
    }

    fun getTypeDetailMap(): Map<Long, String> {
        val maps = mutableMapOf<Long, String>()
        TypeConstants.values().forEach { maps[it.value] = it.displayName }
        return maps
    }

    /**
     * モンスター種族の<DB管理値,表示名>のMapを取得
     */
    fun getRaceMap(): Map<Long, String> {
        val maps = mutableMapOf<Long, String>()
        RaceConstants.values().forEach { maps[it.value] = it.displayName }
        return maps
    }

    /**
     * カードカテゴリを取得する
     */
    fun getTypeString(type: Long): String {
        if (TypeConstants.monsterList.contains(type)) {
            return "モンスター"
        }
        if (TypeConstants.magicList.contains(type)) {
            return "魔法"
        }
        if (TypeConstants.trapList.contains(type)) {
            return "罠"
        }
        return ""
    }


    /**
     * カードタイプの詳細表示名を取得する
     */
    fun getCardTypeDetailName(type: Long): String {
        val type = TypeConstants.fromValue(type)
        return type?.displayName ?: ""
    }

    /**
     * モンスター属性の表示名を取得する
     */
    fun getAttributeName(attributeValue: Long): String {
        val enum = AttributeConstants.fromValue(attributeValue)
        return enum?.displayName ?: ""
    }

    /**
     * モンスター種族の表示名を取得する
     */
    fun getRaceDetailName(race: Long): String {
        val raceConstants = RaceConstants.fromValue(race)
        return raceConstants?.displayName ?: ""
    }

    /**
     * カードタイプから付与したいクラス名を取得する
     */
    fun getClass(type: Long): String {
        if (TypeConstants.effectMonsterList.contains(type)) {
            return "effect_monster"
        }
        if (TypeConstants.normalMonsterList.contains(type)) {
            return "normal_monster"
        }
        if (TypeConstants.synchroMonsterList.contains(type)) {
            return "synchro_monster"
        }
        if (TypeConstants.xyzMonsterList.contains(type)) {
            return "xyz_monster"
        }
        if (TypeConstants.gishkiMonsterList.contains(type)) {
            return "gishki_monster"
        }
        if (TypeConstants.fujonMonsterList.contains(type)) {
            return "fujon_monster"
        }
        if (TypeConstants.penduramMonsterList.contains(type)) {
            return "penduram_monster"
        }
        if (TypeConstants.linkMonsterList.contains(type)) {
            return "link_monster"
        }
        if (TypeConstants.magicList.contains(type)) {
            return "magic"
        }
        if (TypeConstants.trapList.contains(type)) {
            return "trap"
        }
        if (TypeConstants.TOKEN.value == type) {
            return "token_monster"
        }
        if (TypeConstants.PENDURAM_XYZ_MONSTER.value == type) {
            return "penduram_xyz_monster"
        }
        if (TypeConstants.PENDURAM_SYNCHRO_MONSTER.value == type) {
            return "penduram_synchro_monster"
        }
        if (TypeConstants.PENDURAM_FUJON_MONSTER.value == type) {
            return "penduram_fujon_monster"
        }
        if (TypeConstants.PENDURAM_NORMAL_MONSTER.value == type) {
            return "penduram_normal_monster"
        }
        return ""
    }

    /**
     * 表示する守備力を取得
     */
    fun getDef(type: Long, def: Long): String {
        if (def == -2L) {
            return "-"
        }
        return def.toString()
    }

    /**
     * 表示する攻撃力を取得
     */
    fun getAtk(type: Long, atk: Long): String {
        if (atk == -2L) {
            return "-"
        }
        return atk.toString()
    }

    fun haveCardList(): Boolean {
        if (cardList.isEmpty()) {
            return false
        }
        return true
    }
}