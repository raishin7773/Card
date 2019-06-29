package com.raishin.search.specification

import com.raishin.search.emtity.DatasEntity
import com.sun.xml.internal.fastinfoset.stax.events.Util
import org.springframework.data.jpa.domain.Specification
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import javax.persistence.criteria.Predicate
import javax.persistence.criteria.Root

class SearchSpecification {
    fun nameContains(name: String): Specification<DatasEntity>? {
        return if (Util.isEmptyString(name))
            null
        else
            return object : Specification<DatasEntity> {
                override fun toPredicate(root: Root<DatasEntity>, query: CriteriaQuery<*>,
                                         cb: CriteriaBuilder): Predicate {
                    return cb.like(root.get("name"), "%$name%")
                }
            }
    }

    fun typeInclude(typeList: List<Long>): Specification<DatasEntity>? {
        return if (typeList.size == 0)
            null
        else
            return object : Specification<DatasEntity> {
                override fun toPredicate(root: Root<DatasEntity>, query: CriteriaQuery<*>,
                                         cb: CriteriaBuilder): Predicate {
                    return root.get<DatasEntity>("type").`in`(typeList)
                }
            }
    }

}

