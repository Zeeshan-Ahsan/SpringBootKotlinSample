package com.sample.springbootweb

import java.text.SimpleDateFormat
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by zeeshan on 8/14/17.
 */
@Entity
class Journal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int = 0

    var title: String = ""
    var created: LocalDate? = null
        get() = field
        set(value) {
            field = value
        }

    var summary: String = ""

    @Transient
    var formatt: SimpleDateFormat = SimpleDateFormat("MM/dd/yyyy")

    constructor(title: String, summary: String, created: LocalDate?) {
        this.title = title
        this.summary = summary
        this.created = created
    }

    constructor() {

    }
}