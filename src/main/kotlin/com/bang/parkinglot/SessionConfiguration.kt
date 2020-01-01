package com.bang.parkinglot

import org.springframework.context.annotation.Bean
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer
import org.springframework.session.web.http.HeaderHttpSessionIdResolver

@EnableJdbcHttpSession
class SessionConfiguration : AbstractHttpSessionApplicationInitializer() {
    @Bean
    fun httpSessionIdResolver() = HeaderHttpSessionIdResolver.xAuthToken()
}