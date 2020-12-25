package com.raishin.search.constants

/**
 * ペンデュラムモンスターのスケールごとの加算値。
 * これにレベルを足したものがlevelカラムに挿入されている。
 */
enum class AttributeConstants(val displayName: String, val value: Long) {
    EARTH("地", 1),
    WATER("水", 2),
    FIRE("炎", 4),
    WIND("風", 8),
    LIGHT("光", 16),
    DARK("闇", 32),
    DEVINE("神", 64);

    companion object {
        fun fromValue(value: Long): AttributeConstants? {
            return AttributeConstants.values().firstOrNull { it.value == value }
        }
    }
}
