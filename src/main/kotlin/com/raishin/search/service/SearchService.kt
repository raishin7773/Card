package com.raishin.search.service

import com.raishin.search.emtity.DatasEntity
import com.raishin.search.form.SearchForm
import com.raishin.search.repository.DatasRepository
import com.raishin.search.specification.SearchSpecification
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.lang.Nullable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*
import au.com.console.jpaspecificationdsl.*
import com.raishin.search.constants.Constants
import javax.servlet.http.HttpSession


/**
 * デッキ一覧画面用サービス
 */
@Service
@Transactional(readOnly = true)
class SearchService {

    @Autowired
    lateinit var datasRepository: DatasRepository

    @Autowired
    lateinit var session: HttpSession

    /**
     * IDでカードを検索
     * @return
     */
    fun findByID(id: Int): Optional<DatasEntity> {
        return datasRepository.findById(id)
    }

    /**
     *
     */
    fun searchCards(form: SearchForm): List<DatasEntity> {
        var cards = getCardDatas()

        cards = cards.filter { x -> x.alias == 0L}
        if (form.name.isNotEmpty())
            cards = cards.filter { x -> x.name.contains(form.name) }
        if (form.getTypeList().isNotEmpty())
            cards = cards.filter { x -> form.getTypeList().contains(x.type) }
        if(form.atk != null)
            cards = cards.filter { x -> x.atk == form.atk }.filter { x -> Constants.monsterList.contains(x.type)}
        if(form.def != null)
            cards = cards.filter { x -> x.def == form.def }.filter { x -> Constants.monsterList.contains(x.type)}
        if(form.sum != null)
            cards = cards.filter { x -> x.def + x.atk == form.sum }.filter { x -> Constants.monsterList.contains(x.type)}
        if(cards.size > 100)
            cards = cards.take(100)


        return cards

    }

    fun getCardDatas(): List<DatasEntity> {
        var cards = session.getAttribute("cards")
        if (cards == null) {
            cards = datasRepository.findAll()
            session.setAttribute("cards", cards)
        }
        return cards as List<DatasEntity>
    }

}
