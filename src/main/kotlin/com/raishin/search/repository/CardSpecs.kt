package com.raishin.search.repository

import com.raishin.search.emtity.DatasEntity
import com.raishin.search.form.SearchForm
import org.springframework.data.jpa.domain.Specification
import javax.persistence.criteria.Root


class CardSpecs {
    companion object {
        fun nameLike(name: String?): Specification<DatasEntity>? {
            // nullを返すとこの検索条件を無効にすることができる。
            return if (name == null) null
            // カード名でLIKE検索する
            else Specification { root: Root<DatasEntity>, criteriaQuery, criteriaBuilder ->
                criteriaBuilder.like(root.get<String>("name"), "%$name%")
            }
        }

        fun atkEquals(atk: Long?): Specification<DatasEntity>? {
            // nullを返すとこの検索条件を無効にすることができる。
            return if (atk == null) null
            // 攻撃力が等しいカードを取得
            else Specification { root: Root<DatasEntity>, criteriaQuery, criteriaBuilder ->
                criteriaBuilder.equal(root.get<Long>("atk"), atk)
            }
        }

        fun defEquals(def: Long?): Specification<DatasEntity>? {
            // nullを返すとこの検索条件を無効にすることができる。
            return if (def == null) null
            // 守備力が等しいカードを取得
            else Specification { root: Root<DatasEntity>, criteriaQuery, criteriaBuilder ->
                criteriaBuilder.equal(root.get<Long>("def"), def)
            }
        }

        fun sumEquals(sum: Long?): Specification<DatasEntity>? {
            // nullを返すとこの検索条件を無効にすることができる。
            return if (sum == null) null
            // 攻守合計が等しいカードを取得
            else Specification { root: Root<DatasEntity>, criteriaQuery, criteriaBuilder ->
                criteriaBuilder.equal(root.get<Long>("sum"), sum)
            }
        }

        fun typeEquals(form: SearchForm): Specification<DatasEntity>? {
            // nullを返すとこの検索条件を無効にすることができる。
            return if (form.type == null) null
            // カード種別が種別リストのいずれかに該当するカードを取得
            else Specification { root: Root<DatasEntity>, criteriaQuery, criteriaBuilder ->
                root.get<Long>("type").`in`(form.getTypeList())
            }
        }
    }
}

