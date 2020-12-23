package com.raishin.search.constants

enum class TypeConstants(val displayName: String, val value: Long) {
    EFFECT_MONSTER("効果モンスター", 33),
    EFFECT_REVERSE_MONSTER("効果モンスター：リバース", 2097185),
    EFFECT_DUAL_MONSTER("効果モンスター：デュアル", 2081),
    EFFECT_UNION_MONSTER("効果モンスター：ユニオン", 1057),
    EFFECT_UNION_TUNER_MONSTER("効果モンスター：ユニオン：チューナー", 5153),
    EFFECT_SS_MONSTER("効果モンスター：特殊召喚（通常召喚不可）", 33554465),
    EFFECT_TUNER_SS_MONSTER("効果モンスター：チューナー：特殊召喚（通常召喚不可）", 33558561),
    SPIRIT_MONSTER("効果モンスター：スピリット", 545),
    EFFECT_TUNER_MONSTER("効果モンスター：チューナー", 4129),
    GISHKI_EFFECT_MONSTER("儀式：効果モンスター", 161),
    GISHKI_NORMAL_MONSTER("儀式：通常モンスター", 145),
    TOKEN("トークン", 16401),
    NORMAL_MONSTER("通常モンスター", 17),
    NORMAL_TUNER_MONSTER("通常モンスター：チューナー", 4113),
    FUJON_NORMAL_MONSTER("融合：通常モンスター", 65),
    FUJON_E_MONSTER("融合：効果モンスター", 97),
    PENDURAM_MONSTER("ペンデュラム：効果モンスター", 16777249),
    PENDURAM_TUNER_MONSTER("ペンデュラム：チューナー", 16781345),
    PENDURAM_SS_MONSTER("ペンデュラム：特殊召喚（通常召喚不可）", 50331681),
    PENDURAM_NORMAL_MONSTER("ペンデュラム：通常モンスター", 16777233),
    PENDURAM_FUJON_MONSTER("ペンデュラム：融合：効果モンスター", 16777313),
    PENDURAM_XYZ_MONSTER("ペンデュラム：エクシーズ：効果モンスター", 25165857),
    PENDURAM_SYNCHRO_MONSTER("ペンデュラム：シンクロ：効果モンスター", 16785441),
    SYNCHRO_MONSTER("シンクロ：効果モンスター", 8225),
    SYNCHRO_TUNER_MONSTER("シンクロ：チューナー", 12321),
    SYNCHRO_NORMAL_MONSTER("シンクロ：通常モンスター", 8209),
    XYZ_MONSTER("エクシーズ：効果モンスター", 8388641),
    XYZ_NORMAL_MONSTER("エクシーズ：通常モンスター", 8388625),
    LINK_E_MONSTER("リンク：効果モンスター", 67108897),
    LINK_NORMAL_MONSTER("リンク：通常モンスター", 67108865),
    MAGIC("通常魔法", 2),
    GISHKI_MAGIC("儀式魔法", 130),
    SPEED_MAGIC("速攻魔法", 65538),
    FOREVER_MAGIC("永続魔法", 131074),
    EQUIP_MAGIC("装備魔法", 262146),
    FIELD_MAGIC("フィールド魔法", 524290),
    TRAP("通常罠", 4),
    FOREVER_TRAP("永続罠", 131076),
    COUNTER_TRAP("カウンター罠", 1048580);

    companion object {
        fun fromValue(value: Long): TypeConstants? {
            return values().firstOrNull { it.value == value }
        }

        //モンスターリスト
        val monsterList = mutableListOf(
                EFFECT_DUAL_MONSTER.value,
                EFFECT_UNION_TUNER_MONSTER.value,
                EFFECT_UNION_MONSTER.value,
                LINK_NORMAL_MONSTER.value,
                EFFECT_TUNER_SS_MONSTER.value,
                SYNCHRO_TUNER_MONSTER.value,
                PENDURAM_TUNER_MONSTER.value,
                PENDURAM_SS_MONSTER.value,
                GISHKI_EFFECT_MONSTER.value,
                GISHKI_NORMAL_MONSTER.value,
                SYNCHRO_NORMAL_MONSTER.value,
                XYZ_NORMAL_MONSTER.value,
                EFFECT_REVERSE_MONSTER.value,
                NORMAL_TUNER_MONSTER.value,
                EFFECT_MONSTER.value,
                EFFECT_SS_MONSTER.value,
                SPIRIT_MONSTER.value,
                EFFECT_TUNER_MONSTER.value,
                TOKEN.value,
                NORMAL_MONSTER.value,
                FUJON_NORMAL_MONSTER.value,
                FUJON_E_MONSTER.value,
                PENDURAM_MONSTER.value,
                PENDURAM_FUJON_MONSTER.value,
                PENDURAM_XYZ_MONSTER.value,
                PENDURAM_SYNCHRO_MONSTER.value,
                SYNCHRO_MONSTER.value,
                XYZ_MONSTER.value,
                LINK_E_MONSTER.value
        )

        //通常モンスターリスト
        val normalMonsterList = mutableListOf(
                NORMAL_TUNER_MONSTER.value,
                NORMAL_MONSTER.value,
                FUJON_NORMAL_MONSTER.value)

        //シンクロモンスターリスト
        val synchroMonsterList = mutableListOf(
                SYNCHRO_TUNER_MONSTER.value,
                SYNCHRO_MONSTER.value,
                SYNCHRO_NORMAL_MONSTER.value)

        //エクシーズモンスターリスト
        val xyzMonsterList = mutableListOf(
                XYZ_MONSTER.value,
                XYZ_NORMAL_MONSTER.value)

        //儀式モンスターリスト
        val gishkiMonsterList = mutableListOf(
                GISHKI_NORMAL_MONSTER.value,
                GISHKI_EFFECT_MONSTER.value)

        //効果モンスターリスト
        val effectMonsterList = mutableListOf(
                EFFECT_DUAL_MONSTER.value,
                EFFECT_UNION_TUNER_MONSTER.value,
                EFFECT_UNION_MONSTER.value,
                EFFECT_TUNER_SS_MONSTER.value,
                EFFECT_REVERSE_MONSTER.value,
                EFFECT_MONSTER.value,
                EFFECT_SS_MONSTER.value,
                SPIRIT_MONSTER.value,
                EFFECT_TUNER_MONSTER.value)

        // ペンでゅらむモンスターリスト
        val penduramMonsterList = mutableListOf(
                PENDURAM_TUNER_MONSTER.value,
                PENDURAM_SS_MONSTER.value,
                PENDURAM_MONSTER.value)

        // 融合モンスターリスト
        val fujonMonsterList = mutableListOf(
                FUJON_E_MONSTER.value,
                FUJON_NORMAL_MONSTER.value)

        // リンクモンスターリスト
        val linkMonsterList = mutableListOf(
                LINK_E_MONSTER.value,
                LINK_NORMAL_MONSTER.value)

        //罠リスト
        val trapList = mutableListOf(TRAP.value,
                FOREVER_TRAP.value, COUNTER_TRAP.value)

        //魔法リスト
        val magicList = mutableListOf(
                MAGIC.value,
                GISHKI_MAGIC.value,
                SPEED_MAGIC.value,
                FOREVER_MAGIC.value,
                EQUIP_MAGIC.value,
                FIELD_MAGIC.value)
    }
}
