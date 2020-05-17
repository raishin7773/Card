package com.raishin.search.emtity

import javax.persistence.*


@Entity
@Table(name = "datas")
class DatasEntity {

    @Id
    @Column(name = "id")
    var dataId: Int? = null
    var ot: Long? = null
    var alias: Long? = null
    var setcode: Long? = null
    var type: Long? = null
    var atk: Long? = null
    var def: Long? = null
    var level: Long? = null
    var race: Long? = null
    var attribute: Long? = null
    var category: Long? = null
    var name: String? = null
    var description: String? = null
    var sum: Long? = null

}
