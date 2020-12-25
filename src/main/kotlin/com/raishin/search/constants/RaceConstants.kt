package com.raishin.search.constants

enum class RaceConstants(val displayName: String, val value: Long) {
    WARRIOR("戦士", 1),
    WIZARD("魔法使い", 2),
    ANGEL("天使", 4),
    DEVIL("悪魔", 8),
    UNDEAD("アンデット", 16),
    MACHINE("機械", 32),
    WATER("水", 64),
    BLAZE("炎", 128),
    ROCK("岩石", 256),
    BIRDS_AND_BEASTS("鳥獣", 512),
    PLANT("植物", 1024),
    INSECT("昆虫", 2048),
    THUNDER("雷", 4096),
    DRAGON("ドラゴン", 8192),
    BEAST("獣", 16384),
    BEAST_WARRIOR("獣戦士", 32768),
    DINOSAUR("恐竜", 65536),
    FISH("魚", 131072),
    SEA_DRAGON("海竜", 262144),
    REPTILES("爬虫類", 524288),
    PSYCHIC("サイキック", 1048576),
    GOD_PHANTOM_BEAST("神幻獣", 2097152),
    CREATOR("創造神", 4194394),
    PHANTOM_DRAGON("幻竜", 8388608),
    CYBERS("サイバース", 16777216);

    companion object {
        fun fromValue(value: Long): RaceConstants? {
            return values().firstOrNull { it.value == value }
        }
    }
}
