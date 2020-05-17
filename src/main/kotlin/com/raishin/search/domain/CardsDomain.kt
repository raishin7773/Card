package com.raishin.search.domain

import com.raishin.search.emtity.DatasEntity

class CardsDomain {

    companion object {
        fun filterCards(cards: List<DatasEntity>): List<DatasEntity> {
            return if (cards.size > 100) cards.take(100)
            else cards
        }
    }
}
