package com.raishin.search.service

import com.raishin.search.constants.Constants
import com.raishin.search.domain.CardsDomain
import com.raishin.search.emtity.DatasEntity
import com.raishin.search.form.SearchForm
import com.raishin.search.repository.DatasRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cache.annotation.CacheEvict
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*
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

    @Cacheable("SearchCache")
    fun getCardDatas(): MutableList<DatasEntity> {
        val start = System.currentTimeMillis()

        var cards = datasRepository.findAll()

        // ログをだす
        var end = System.currentTimeMillis();
        var time = end - start;
        println("cache is not used. exec time was : " + time + "ms")

        return cards
    }

    @CacheEvict("SearchCache")
    fun deleteCache(){}

}
