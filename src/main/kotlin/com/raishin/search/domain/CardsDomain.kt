package com.raishin.search.domain

import com.raishin.search.constants.Constants
import com.raishin.search.emtity.DatasEntity
import com.raishin.search.form.SearchForm

class CardsDomain(var cards: List<DatasEntity>) {

    fun searchCards(form: SearchForm): List<DatasEntity> {

        cards = cards.filter { x -> x.alias == 0L }
        if (form.name.isNotEmpty())
            cards = cards.filter { x -> x.name.contains(form.name) }
        if (form.getTypeList().isNotEmpty())
            cards = cards.filter { x -> form.getTypeList().contains(x.type) }
        if (form.atk != null)
            cards = cards.filter { x -> x.atk == form.atk }.filter { x -> Constants.monsterList.contains(x.type) }
        if (form.def != null)
            cards = cards.filter { x -> x.def == form.def }.filter { x -> Constants.monsterList.contains(x.type) }
        if (form.sum != null)
            cards = cards.filter { x -> x.def + x.atk == form.sum }.filter { x -> Constants.monsterList.contains(x.type) }
        if (cards.size > 100)
            cards = cards.take(100)


        return cards

    }
}
