package com.bang.parkinglot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.FilterRegistrationBean
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ParkingLotApplication

fun main(args: Array<String>) {
    runApplication<ParkingLotApplication>(*args)
}

@Bean
fun filterRegistrationBean(parkingLotFilter: ParkingLotFilter): FilterRegistrationBean<ParkingLotFilter>? {
    val registrationBean: FilterRegistrationBean<ParkingLotFilter> = FilterRegistrationBean<ParkingLotFilter>()
    registrationBean.filter = parkingLotFilter
    registrationBean.addUrlPatterns("/*")
    registrationBean.order = 2
    return registrationBean
}