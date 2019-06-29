package com.raishin.search.constants

class Constants {

    companion object {
        //モンスター
        //リバースモンスター
        const val REVERSE_MONSTER: Long = 2097185
        //効果モンスター
        const val EFFECT_MONSTER: Long = 33
        //効果モンスター：特殊召喚（通常召喚不可）
        const val EFFECT_SS_MONSTER: Long = 33554465
        //効果モンスター：スピリット
        const val SPIRIT_MONSTER: Long = 545
        //チューナー
        const val EFFECT_TUNER_MONSTER: Long = 4129
        //トークン
        const val TOKEN: Long = 16401
        //通常モンスター
        const val NORMAL_MONSTER: Long = 17
        //融合通常モンスター
        const val FUJON_NORMAL_MONSTER: Long = 65
        //融合モンスター
        const val FUJON_E_MONSTER: Long = 97
        //ペンデュラムモンスター
        const val PENDURAM_MONSTER: Long = 16777249
        //ペンデュラム融合
        const val PENDURAM_FUJON_MONSTER: Long = 16777313
        //ペンデュラムエクシーズ
        const val PENDURAM_XYZ_MONSTER: Long = 25165857
        //ペンデュラムシンクロ
        const val PENDURAM_SYNCHRO_MONSTER: Long = 16785441
        //シンクロモンスターモンスター
        const val SYNCHRO_MONSTER: Long = 8225
        //エクシーズモンスター
        const val XYZ_MONSTER: Long = 8388641
        //リンクモンスター
        const val LINK_E_MONSTER: Long = 67108897
        //モンスターリスト
        val monsterList = mutableListOf(REVERSE_MONSTER, EFFECT_MONSTER, EFFECT_SS_MONSTER, SPIRIT_MONSTER, EFFECT_TUNER_MONSTER
                , TOKEN, NORMAL_MONSTER, FUJON_NORMAL_MONSTER, FUJON_E_MONSTER, PENDURAM_MONSTER, PENDURAM_FUJON_MONSTER, PENDURAM_XYZ_MONSTER
                , PENDURAM_SYNCHRO_MONSTER, SYNCHRO_MONSTER, XYZ_MONSTER, LINK_E_MONSTER)

        //魔法
        //通常魔法
        const val MAGIC: Long = 2
        //速攻魔法
        const val SPEED_MAGIC: Long = 65538
        //永続魔法
        const val FOREVER_MAGIC: Long = 131074
        //装備魔法
        const val EQUIP_MAGIC: Long = 262146
        //フィールド魔法
        const val FIELD_MAGIC: Long = 524290
        //魔法リスト
        val magicList = mutableListOf(MAGIC, SPEED_MAGIC, FOREVER_MAGIC, EQUIP_MAGIC, FIELD_MAGIC)


        //罠
        //通常罠
        const val TRAP: Long = 4
        //永続罠
        const val FOREVER_TRAP: Long = 131076
        //カウンター罠
        const val COUNTER_TRAP: Long = 1048580
        //罠リスト
        val trapList = mutableListOf(TRAP, FOREVER_TRAP, COUNTER_TRAP)
    }
}
