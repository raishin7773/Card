package com.raishin.search.repository

import com.raishin.search.constants.LevelConstants
import com.raishin.search.emtity.DatasEntity
import com.raishin.search.form.SearchForm
import org.springframework.data.jpa.domain.Specification
import javax.persistence.criteria.Root


class CardSpecs {
    companion object {
        fun nameLike(name: String?): Specification<DatasEntity>? {
            // nullを返すとこの検索条件を無効にすることができる。
            return if (name.isNullOrBlank() == null) null
            else Specification { root: Root<DatasEntity>, criteriaQuery, criteriaBuilder ->
                criteriaBuilder.like(root.get<String>("name"), "%$name%")
            }
        }

        fun atkEquals(atk: Long?): Specification<DatasEntity>? {
            // nullを返すとこの検索条件を無効にすることができる。
            return if (atk == null) null
            else Specification { root: Root<DatasEntity>, criteriaQuery, criteriaBuilder ->
                criteriaBuilder.equal(root.get<Long>("atk"), atk)
            }
        }

        fun defEquals(def: Long?): Specification<DatasEntity>? {
            // nullを返すとこの検索条件を無効にすることができる。
            return if (def == null) null
            else Specification { root: Root<DatasEntity>, criteriaQuery, criteriaBuilder ->
                criteriaBuilder.equal(root.get<Long>("def"), def)
            }
        }

        fun sumEquals(sum: Long?): Specification<DatasEntity>? {
            // nullを返すとこの検索条件を無効にすることができる。
            return if (sum == null) null
            else Specification { root: Root<DatasEntity>, criteriaQuery, criteriaBuilder ->
                criteriaBuilder.equal(root.get<Long>("sum"), sum)
            }
        }

        /**
         * モンスター属性の検索
         */
        fun attributeEquals(attribute: Long?): Specification<DatasEntity>? {
            // nullを返すとこの検索条件を無効にすることができる。
            return if (attribute == null) null
            else Specification { root: Root<DatasEntity>, criteriaQuery, criteriaBuilder ->
                criteriaBuilder.equal(root.get<Long>("attribute"), attribute)
            }
        }

        fun levelEquals(level: Long?): Specification<DatasEntity>? {
            // nullを返すとこの検索条件を無効にすることができる。
            if (level == null) return null
            // ペンデュラムを考慮
            val list = mutableListOf(
                    level,
                    16842752 + level,
                    33685504 + level,
                    50528256 + level,
                    67371008 + level,
                    84213760 + level,
                    101056512 + level,
                    117899264 + level,
                    134742016 + level,
                    151584768 + level,
                    168427520 + level,
                    185270272 + level,
                    202113024 + level
            )
            return Specification { root: Root<DatasEntity>, criteriaQuery, criteriaBuilder ->
                root.get<Long>("level").`in`(list)
            }
        }

        fun levelGreaterThanOrEqualTo(levelFrom: Long?): Specification<DatasEntity>? {
            // nullを返すとこの検索条件を無効にすることができる。
            if (levelFrom == null) return null
            val levelFromP1 = LevelConstants.P1.value + levelFrom
            val levelFromP2 = LevelConstants.P2.value + levelFrom
            val levelFromP3 = LevelConstants.P3.value + levelFrom
            val levelFromP4 = LevelConstants.P4.value + levelFrom
            val levelFromP5 = LevelConstants.P5.value + levelFrom
            val levelFromP6 = LevelConstants.P6.value + levelFrom
            val levelFromP7 = LevelConstants.P7.value + levelFrom
            val levelFromP8 = LevelConstants.P8.value + levelFrom
            val levelFromP9 = LevelConstants.P9.value + levelFrom
            val levelFromP10 = LevelConstants.P10.value + levelFrom
            val levelFromP11 = LevelConstants.P11.value + levelFrom
            val levelFromP12 = LevelConstants.P12.value + levelFrom

            return Specification { root: Root<DatasEntity>, criteriaQuery, criteriaBuilder ->
                criteriaBuilder.or(
                        criteriaBuilder.between(root.get<Long>("level"), levelFrom, levelFrom + 12),
                        criteriaBuilder.between(root.get<Long>("level"), levelFromP1, levelFromP1 + 12),
                        criteriaBuilder.between(root.get<Long>("level"), levelFromP2, levelFromP2 + 12),
                        criteriaBuilder.between(root.get<Long>("level"), levelFromP3, levelFromP3 + 12),
                        criteriaBuilder.between(root.get<Long>("level"), levelFromP4, levelFromP4 + 12),
                        criteriaBuilder.between(root.get<Long>("level"), levelFromP5, levelFromP5 + 12),
                        criteriaBuilder.between(root.get<Long>("level"), levelFromP6, levelFromP6 + 12),
                        criteriaBuilder.between(root.get<Long>("level"), levelFromP7, levelFromP7 + 12),
                        criteriaBuilder.between(root.get<Long>("level"), levelFromP8, levelFromP8 + 12),
                        criteriaBuilder.between(root.get<Long>("level"), levelFromP9, levelFromP9 + 12),
                        criteriaBuilder.between(root.get<Long>("level"), levelFromP10, levelFromP10 + 12),
                        criteriaBuilder.between(root.get<Long>("level"), levelFromP11, levelFromP11 + 12),
                        criteriaBuilder.between(root.get<Long>("level"), levelFromP12, levelFromP12 + 12)
                )
            }
        }

        fun levelLessThanOrEqualTo(levelTo: Long?): Specification<DatasEntity>? {
            // nullを返すとこの検索条件を無効にすることができる。
            if (levelTo == null) return null
            val levelToP1 = LevelConstants.P1.value + levelTo
            val levelToP2 = LevelConstants.P2.value + levelTo
            val levelToP3 = LevelConstants.P3.value + levelTo
            val levelToP4 = LevelConstants.P4.value + levelTo
            val levelToP5 = LevelConstants.P5.value + levelTo
            val levelToP6 = LevelConstants.P6.value + levelTo
            val levelToP7 = LevelConstants.P7.value + levelTo
            val levelToP8 = LevelConstants.P8.value + levelTo
            val levelToP9 = LevelConstants.P9.value + levelTo
            val levelToP10 = LevelConstants.P10.value + levelTo
            val levelToP11 = LevelConstants.P11.value + levelTo
            val levelToP12 = LevelConstants.P12.value + levelTo
            return Specification { root: Root<DatasEntity>, criteriaQuery, criteriaBuilder ->
                criteriaBuilder.or(
                        criteriaBuilder.between(root.get<Long>("level"), levelTo - 12, levelTo),
                        criteriaBuilder.between(root.get<Long>("level"), levelToP1 - 12, levelToP1),
                        criteriaBuilder.between(root.get<Long>("level"), levelToP2 - 12, levelToP2),
                        criteriaBuilder.between(root.get<Long>("level"), levelToP3 - 12, levelToP3),
                        criteriaBuilder.between(root.get<Long>("level"), levelToP4 - 12, levelToP4),
                        criteriaBuilder.between(root.get<Long>("level"), levelToP5 - 12, levelToP5),
                        criteriaBuilder.between(root.get<Long>("level"), levelToP6 - 12, levelToP6),
                        criteriaBuilder.between(root.get<Long>("level"), levelToP7 - 12, levelToP7),
                        criteriaBuilder.between(root.get<Long>("level"), levelToP8 - 12, levelToP8),
                        criteriaBuilder.between(root.get<Long>("level"), levelToP9 - 12, levelToP9),
                        criteriaBuilder.between(root.get<Long>("level"), levelToP10 - 12, levelToP10),
                        criteriaBuilder.between(root.get<Long>("level"), levelToP11 - 12, levelToP11),
                        criteriaBuilder.between(root.get<Long>("level"), levelToP12 - 12, levelToP12)
                )
            }
        }

        fun raceEquals(race: Long?): Specification<DatasEntity>? {
            // nullを返すとこの検索条件を無効にすることができる。
            return if (race == null) null
            else Specification { root: Root<DatasEntity>, criteriaQuery, criteriaBuilder ->
                criteriaBuilder.equal(root.get<Long>("race"), race)
            }
        }

        fun descriptionLike(description: String?): Specification<DatasEntity>? {
            // nullを返すとこの検索条件を無効にすることができる。
            return if (description.isNullOrBlank()) null
            else Specification { root: Root<DatasEntity>, criteriaQuery, criteriaBuilder ->
                criteriaBuilder.like(root.get<String>("description"), "%$description%")
            }
        }

        fun typeIn(form: SearchForm): Specification<DatasEntity>? {
            // nullを返すとこの検索条件を無効にすることができる。
            return if (form.type == null) null
            else Specification { root: Root<DatasEntity>, criteriaQuery, criteriaBuilder ->
                root.get<Long>("type").`in`(form.getTypeList())
            }
        }

        fun typeEquals(typeDetail: Long?): Specification<DatasEntity>? {
            // nullを返すとこの検索条件を無効にすることができる。
            return if (typeDetail == null) null
            else Specification { root: Root<DatasEntity>, criteriaQuery, criteriaBuilder ->
                criteriaBuilder.equal(root.get<Long>("type"), typeDetail)
            }
        }
    }
}

