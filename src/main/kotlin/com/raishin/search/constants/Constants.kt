package com.raishin.search.constants

class Constants {

    companion object {
        //効果モンスター
        const val EFFECT_MONSTER: Long = 33
        //効果モンスター：リバース
        const val EFFECT_REVERSE_MONSTER: Long = 2097185
        //効果モンスター：デュアル
        const val EFFECT_DUAL_MONSTER: Long = 2081
        //効果モンスター：ユニオン
        const val EFFECT_UNION_MONSTER: Long = 1057
        //効果モンスター：ユニオン：チューナー
        const val EFFECT_UNION_TUNER_MONSTER: Long = 5153
        //効果モンスター：特殊召喚（通常召喚不可）
        const val EFFECT_SS_MONSTER: Long = 33554465
        //効果モンスター：チューナー：特殊召喚（通常召喚不可）
        const val EFFECT_TUNER_SS_MONSTER: Long = 33558561
        //効果モンスター：スピリット
        const val SPIRIT_MONSTER: Long = 545
        //効果モンスター：チューナー
        const val EFFECT_TUNER_MONSTER: Long = 4129
        //儀式：効果モンスター
        const val GISHKI_EFFECT_MONSTER:Long = 161
        //儀式：通常モンスター
        const val GISHKI_NORMAL_MONSTER:Long = 145
        //トークン
        const val TOKEN: Long = 16401
        //通常モンスター
        const val NORMAL_MONSTER: Long = 17
        //通常モンスター：チューナー
        const val NORMAL_TUNER_MONSTER: Long = 4113
        //融合通常モンスター
        const val FUJON_NORMAL_MONSTER: Long = 65
        //融合モンスター
        const val FUJON_E_MONSTER: Long = 97
        //ペンデュラムモンスター
        const val PENDURAM_MONSTER: Long = 16777249
        //ペンデュラムモンスター:チューナー
        const val PENDURAM_TUNER_MONSTER: Long = 16781345
        //ペンデュラムモンスター:特殊召喚（通常召喚不可）
        const val PENDURAM_SS_MONSTER: Long = 50331681
        //ペンデュラムモンスター：通常
        const val PENDURAM_NORMAL_MONSTER: Long = 16777233
        //ペンデュラム融合
        const val PENDURAM_FUJON_MONSTER: Long = 16777313
        //ペンデュラムエクシーズ
        const val PENDURAM_XYZ_MONSTER: Long = 25165857
        //ペンデュラムシンクロ
        const val PENDURAM_SYNCHRO_MONSTER: Long = 16785441
        //シンクロモンスター
        const val SYNCHRO_MONSTER: Long = 8225
        //シンクロモンスター：チューナー
        const val SYNCHRO_TUNER_MONSTER: Long = 12321
        //シンクロモンスター：通常
        const val SYNCHRO_NORMAL_MONSTER: Long = 8209
        //エクシーズモンスター
        const val XYZ_MONSTER: Long = 8388641
        //エクシーズモンスター:通常
        const val XYZ_NORMAL_MONSTER: Long = 8388625
        //リンクモンスター
        const val LINK_E_MONSTER: Long = 67108897
        //リンクモンスター：通常
        const val LINK_NORMAL_MONSTER: Long = 67108865

        //モンスターリスト
        val monsterList = mutableListOf(EFFECT_DUAL_MONSTER,EFFECT_UNION_TUNER_MONSTER,EFFECT_UNION_MONSTER,LINK_NORMAL_MONSTER,EFFECT_TUNER_SS_MONSTER,SYNCHRO_TUNER_MONSTER,PENDURAM_TUNER_MONSTER,PENDURAM_SS_MONSTER,GISHKI_EFFECT_MONSTER,GISHKI_NORMAL_MONSTER,SYNCHRO_NORMAL_MONSTER,XYZ_NORMAL_MONSTER,EFFECT_REVERSE_MONSTER,NORMAL_TUNER_MONSTER, EFFECT_MONSTER, EFFECT_SS_MONSTER, SPIRIT_MONSTER, EFFECT_TUNER_MONSTER
                , TOKEN, NORMAL_MONSTER, FUJON_NORMAL_MONSTER, FUJON_E_MONSTER, PENDURAM_MONSTER, PENDURAM_FUJON_MONSTER, PENDURAM_XYZ_MONSTER
                , PENDURAM_SYNCHRO_MONSTER, SYNCHRO_MONSTER, XYZ_MONSTER, LINK_E_MONSTER)
        //通常モンスターリスト
        val normalMonsterList = mutableListOf(NORMAL_TUNER_MONSTER,NORMAL_MONSTER,FUJON_NORMAL_MONSTER)
        //シンクロモンスターリスト
        val synchroMonsterList = mutableListOf(SYNCHRO_TUNER_MONSTER,SYNCHRO_MONSTER, SYNCHRO_NORMAL_MONSTER)
        //エクシーズモンスターリスト
        val xyzMonsterList = mutableListOf(XYZ_MONSTER, XYZ_NORMAL_MONSTER)
        //儀式モンスターリスト
        val gishkiMonsterList = mutableListOf(GISHKI_NORMAL_MONSTER, GISHKI_EFFECT_MONSTER)
        //効果モンスターリスト
        val effectMonsterList = mutableListOf(EFFECT_DUAL_MONSTER,EFFECT_UNION_TUNER_MONSTER,EFFECT_UNION_MONSTER,EFFECT_TUNER_SS_MONSTER,EFFECT_REVERSE_MONSTER,EFFECT_MONSTER,EFFECT_SS_MONSTER,SPIRIT_MONSTER,EFFECT_TUNER_MONSTER)
        // ペンでゅらむモンスターリスト
        val penduramMonsterList = mutableListOf(PENDURAM_TUNER_MONSTER,PENDURAM_SS_MONSTER,PENDURAM_MONSTER)
        // 融合モンスターリスト
        val fujonMonsterList = mutableListOf(FUJON_E_MONSTER,FUJON_NORMAL_MONSTER)
        // リンクモンスターリスト
        val linkMonsterList = mutableListOf(LINK_E_MONSTER,LINK_NORMAL_MONSTER)


        //魔法
        //通常魔法
        const val MAGIC: Long = 2
        //儀式魔法
        const val GISHKI_MAGIC: Long = 130
        //速攻魔法
        const val SPEED_MAGIC: Long = 65538
        //永続魔法
        const val FOREVER_MAGIC: Long = 131074
        //装備魔法
        const val EQUIP_MAGIC: Long = 262146
        //フィールド魔法
        const val FIELD_MAGIC: Long = 524290
        //魔法リスト
        val magicList = mutableListOf(MAGIC, GISHKI_MAGIC,SPEED_MAGIC, FOREVER_MAGIC, EQUIP_MAGIC, FIELD_MAGIC)


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
