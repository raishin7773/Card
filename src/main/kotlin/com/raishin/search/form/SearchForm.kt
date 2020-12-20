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

    /**
     * カードカテゴリを取得する
     */
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


    /**
     * カードタイプの詳細表示名を取得する
     */
    fun getCardTypeDetailName(type: Long): String {
        return when (type) {
            Constants.EFFECT_MONSTER -> "効果モンスター"
            Constants.EFFECT_REVERSE_MONSTER -> "効果モンスター：リバース"
            Constants.EFFECT_DUAL_MONSTER -> "効果モンスター：デュアル"
            Constants.EFFECT_UNION_MONSTER -> "効果モンスター：ユニオン"
            Constants.EFFECT_UNION_TUNER_MONSTER -> "効果モンスター：ユニオン：チューナー"
            Constants.EFFECT_SS_MONSTER -> "効果モンスター：特殊召喚（通常召喚不可）"
            Constants.EFFECT_TUNER_SS_MONSTER -> "効果モンスター：チューナー：特殊召喚（通常召喚不可）"
            Constants.SPIRIT_MONSTER -> "効果モンスター：スピリット"
            Constants.EFFECT_TUNER_MONSTER -> "効果モンスター：チューナー"
            Constants.GISHKI_EFFECT_MONSTER -> "儀式：効果モンスター"
            Constants.GISHKI_NORMAL_MONSTER -> "儀式：通常モンスター"
            Constants.TOKEN -> "トークン"
            Constants.NORMAL_MONSTER -> "通常モンスター"
            Constants.NORMAL_TUNER_MONSTER -> "通常モンスター：チューナー"
            Constants.FUJON_NORMAL_MONSTER -> "融合：通常モンスター"
            Constants.FUJON_E_MONSTER -> "融合：効果モンスター"
            Constants.PENDURAM_MONSTER -> "ペンデュラム：効果モンスター"
            Constants.PENDURAM_TUNER_MONSTER -> "ペンデュラム：効果モンスター：チューナー"
            Constants.PENDURAM_SS_MONSTER -> "ペンデュラム：効果モンスター：特殊召喚（通常召喚不可）"
            Constants.PENDURAM_NORMAL_MONSTER -> "ペンデュラム：通常モンスター"
            Constants.PENDURAM_FUJON_MONSTER -> "ペンデュラム：融合：効果モンスター"
            Constants.PENDURAM_XYZ_MONSTER -> "ペンデュラム：エクシーズ：効果モンスター"
            Constants.PENDURAM_SYNCHRO_MONSTER -> "ペンデュラム：シンクロ：効果モンスター"
            Constants.SYNCHRO_MONSTER -> "シンクロ：効果モンスター"
            Constants.SYNCHRO_TUNER_MONSTER -> "シンクロ：効果モンスター：チューナー"
            Constants.SYNCHRO_NORMAL_MONSTER -> "シンクロ：通常モンスター"
            Constants.XYZ_MONSTER -> "エクシーズ：効果モンスター"
            Constants.XYZ_NORMAL_MONSTER -> "エクシーズ：通常モンスター"
            Constants.LINK_E_MONSTER -> "リンク：効果モンスター"
            Constants.LINK_NORMAL_MONSTER -> "リンク：通常モンスター"
            Constants.MAGIC -> "通常魔法"
            Constants.GISHKI_MAGIC -> "儀式魔法"
            Constants.SPEED_MAGIC -> "速攻魔法"
            Constants.FOREVER_MAGIC -> "永続魔法"
            Constants.EQUIP_MAGIC -> "装備魔法"
            Constants.FIELD_MAGIC -> "フィールド魔法"
            Constants.TRAP -> "通常罠"
            Constants.FOREVER_TRAP -> "永続罠"
            Constants.COUNTER_TRAP -> "カウンター罠"
            else -> ""
        }
    }

    /**
     * カードタイプから付与したいクラス名を取得する
     */
    fun getClass(type: Long): String {
        if (Constants.effectMonsterList.contains(type)) {
            return "effect_monster"
        }
        if (Constants.normalMonsterList.contains(type)) {
            return "normal_monster"
        }
        if (Constants.synchroMonsterList.contains(type)) {
            return "synchro_monster"
        }
        if (Constants.xyzMonsterList.contains(type)) {
            return "xyz_monster"
        }
        if (Constants.gishkiMonsterList.contains(type)) {
            return "gishki_monster"
        }
        if (Constants.fujonMonsterList.contains(type)) {
            return "fujon_monster"
        }
        if (Constants.penduramMonsterList.contains(type)) {
            return "penduram_monster"
        }
        if (Constants.linkMonsterList.contains(type)) {
            return "link_monster"
        }
        if (Constants.magicList.contains(type)) {
            return "magic"
        }
        if (Constants.trapList.contains(type)) {
            return "trap"
        }
        if (Constants.TOKEN == type) {
            return "token_monster"
        }
        if (Constants.PENDURAM_XYZ_MONSTER == type) {
            return "penduram_xyz_monster"
        }
        if (Constants.PENDURAM_SYNCHRO_MONSTER == type) {
            return "penduram_synchro_monster"
        }
        if (Constants.PENDURAM_FUJON_MONSTER == type) {
            return "penduram_fujon_monster"
        }
        if (Constants.PENDURAM_NORMAL_MONSTER == type) {
            return "penduram_normal_monster"
        }
        return ""
    }

    /**
     * 表示する守備力を取得
     */
    fun getDef(type: Long, def: Long): String {
        if (Constants.LINK_E_MONSTER == type ||
                Constants.magicList.contains(type) ||
                Constants.trapList.contains(type) ||
                def == -2L) {
            return "-"
        }
        return def.toString()
    }

    /**
     * 表示する攻撃力を取得
     */
    fun getAtk(type: Long, atk: Long): String {
        if (Constants.magicList.contains(type) ||
                Constants.trapList.contains(type) ||
                atk == -2L) {
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