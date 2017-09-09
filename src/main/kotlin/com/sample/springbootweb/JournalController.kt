package com.sample.springbootweb

import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.time.LocalDate


/**
 * Created by zeeshan on 8/14/17.
 */
@Controller
class JournalController(val repo: JournalRepository) {

    @GetMapping("/")
    fun index(model: Model): String {
        var r = repo.findAll()
        model.addAttribute("journal", r)

        return "index"
    }

    @RequestMapping(value = "/journal", produces = arrayOf(MediaType.APPLICATION_JSON_UTF8_VALUE))
    @ResponseBody
    fun getJournal(): List<Journal> {
        return repo.findAll()
    }

    @RequestMapping(value = "/save")
    fun save(model: Model): String {
        var j: Journal = Journal("Asp.Net MVC", "Learn Asp.Net MVC", LocalDate.now())
        repo.save(j)

        return "index"
    }
}