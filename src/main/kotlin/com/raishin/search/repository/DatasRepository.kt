package com.raishin.search.repository

import com.raishin.search.emtity.DatasEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository


@Repository
interface DatasRepository : JpaRepository<DatasEntity, Int> , JpaSpecificationExecutor<DatasEntity> {
}