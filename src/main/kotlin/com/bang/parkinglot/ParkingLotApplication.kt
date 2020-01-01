package com.bang.parkinglot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ParkingLotApplication

fun main(args: Array<String>) {
    runApplication<ParkingLotApplication>(*args)
}