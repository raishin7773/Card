package com.raishin.search.emtity

import javax.persistence.*


@Entity
@Table(name = "datas")
class DatasEntity {

    @Id
    @Column(name = "id")
    var dataId: Int = 0
    var ot: Long = 0
    var alias: Long = 0
    var setcode: Long = 0
    var type: Long = 0
    var atk: Long = 0
    var def: Long = 0
    var level: Long = 0
    var race: Long = 0
    var attribute: Long = 0
    var category: Long = 0
    var name:String =""
    var description:String =""

}
