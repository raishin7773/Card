package com.raishin.search.controller

import com.raishin.search.domain.CardsDomain
import com.raishin.search.form.SearchForm
import com.raishin.search.service.SearchService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class SearchController {

    @Autowired
    lateinit var seachService: SearchService

    val logger: Logger = LoggerFactory.getLogger(SearchController::class.java)

    @RequestMapping("/")
    fun index(@ModelAttribute searchForm: SearchForm): String {
        logger.info("start")
        return "index"
    }

    @RequestMapping("/card/search")
    fun search(@ModelAttribute form: SearchForm): String {
        var cards = seachService.getCardDatas(form)
        form.cardList = CardsDomain.filterCards(cards)
        return "index"
    }
}

