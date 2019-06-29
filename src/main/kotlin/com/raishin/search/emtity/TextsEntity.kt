package com.raishin.search.emtity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "texts")
class TextsEntity {

    @Id
    @Column(name = "id")
    var textId: Int = 0
    var name: String = ""
    var description: String = ""
    var str1: String = ""
    var str2: String = ""
    var str3: String = ""
    var str4: String = ""
    var str5: String = ""
    var str6: String = ""
    var str7: String = ""
    var str8: String = ""
    var str9: String = ""
    var str10: String = ""
    var str11: String = ""
    var str12: String = ""
    var str13: String = ""
    var str14: String = ""
    var str15: String = ""
    var str16: String = ""

}