package com.raishin.search.controller

import com.raishin.search.domain.CardsDomain
import com.raishin.search.form.SearchForm
import com.raishin.search.service.SearchService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class SearchController {

    @Autowired
    lateinit var seachService: SearchService

    @RequestMapping("/")
    fun index(@ModelAttribute searchForm: SearchForm): String {
        return "index"
    }

    @RequestMapping("/card/search")
    fun search(@ModelAttribute form: SearchForm): String {

        var cards = seachService.getCardDatas()
        form.cardList = CardsDomain(cards).searchCards(form)
        return "index"
    }

    @RequestMapping("/card/deleteCache")
    fun deleteCache(@ModelAttribute form: SearchForm): String {
        seachService.deleteCache()
        return "index"
    }



}

