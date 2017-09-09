package com.sample.springbootweb

import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by zeeshan on 8/14/17.
 */
interface JournalRepository : JpaRepository<Journal, Long> {

}