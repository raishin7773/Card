package com.raishin.search.form

import com.raishin.search.constants.Constants
import com.raishin.search.emtity.DatasEntity

class SearchForm {
    var name: String = ""
    var type: Long? = null
    var atk: Long? = null
    var def: Long? = null
    var sum: Long? = null
    var cardList: List<DatasEntity> = mutableListOf()

    fun getTypeList(): List<Long> {
        if (type == 1L) {
            return Constants.monsterList
        }
        if (type == 2L) {
            return Constants.magicList
        }
        if (type == 3L) {
            return Constants.trapList
        }
        return mutableListOf()
    }

    fun getTypeValueList(): Map<String, Long> {
        return mapOf("モンスター" to 1L, "魔法" to 2L, "罠" to 3L)
    }

    fun getTypeString(type: Long): String {
        if (Constants.monsterList.contains(type)) {
            return "モンスター"
        }
        if (Constants.magicList.contains(type)) {
            return "魔法"
        }
        if (Constants.trapList.contains(type)) {
            return "罠"
        }
        return ""
    }

    fun getDef(type: Long, def: Long): String {
        if (Constants.LINK_E_MONSTER == type ||
                Constants.magicList.contains(type) ||
                Constants.trapList.contains(type)) {
            return "-"
        }
        return def.toString()
    }

    fun getAtk(type: Long, atk: Long): String {
        if (Constants.magicList.contains(type) ||
                Constants.trapList.contains(type)) {
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