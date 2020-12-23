package com.raishin.search.repository

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

