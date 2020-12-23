package com.raishin.search.form

import com.raishin.search.constants.TypeConstants
import com.raishin.search.emtity.DatasEntity

class SearchForm {
    var name: String = ""
    var type: Long? = null
    var typeDetail: Long? = null
    var atk: Long? = null
    var def: Long? = null
    var sum: Long? = null
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

    fun getTypeMap(): Map<String, Long> {
        return mapOf("モンスター" to 1L, "魔法" to 2L, "罠" to 3L)
    }

    fun getTypeDetailMap(): Map<Long, String> {
        val maps = mutableMapOf<Long, String>()
        TypeConstants.values().forEach { maps[it.value] = it.displayName }
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