package com.raishin.search.mapper

import com.raishin.search.emtity.DatasEntity
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface DatasMapper {

//    @Insert("""
//        INSERT INTO todo
//            (title, details, finished)
//        VALUES
//            (#{title}, #{details}, #{finished})
//    """)
//    @Options(useGeneratedKeys = true, keyProperty = "id")
//    fun insert(todo: Todo)

    @Select("""
        SELECT
            *
        FROM
            datas
        WHERE
            name like '%#{name}%'
    """)
    fun select(name: String?): List<DatasEntity>

}