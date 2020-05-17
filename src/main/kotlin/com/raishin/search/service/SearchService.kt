package com.raishin.search.service

import com.raishin.search.emtity.DatasEntity
import com.raishin.search.form.SearchForm
import com.raishin.search.repository.CardSpecs
import com.raishin.search.repository.DatasRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.domain.Specifications
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


/**
 * デッキ一覧画面用サービス
 */
@Service
@Transactional(readOnly = true)
class SearchService {

    @Autowired
    lateinit var datasRepository: DatasRepository

    fun getCardDatas(form: SearchForm): MutableList<DatasEntity> {

        return datasRepository.findAll(
                Specifications.where(CardSpecs.nameLike(form.name))
                        .and(CardSpecs.atkEquals(form.atk))
                        .and(CardSpecs.defEquals(form.def))
                        .and(CardSpecs.sumEquals(form.sum))
                        .and(CardSpecs.typeEquals(form))
                )
    }

}
