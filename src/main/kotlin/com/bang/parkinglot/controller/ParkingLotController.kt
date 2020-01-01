package com.bang.parkinglot.controller

import com.bang.parkinglot.command.CommandRequest
import com.bang.parkinglot.command.CommandResponse
import com.bang.parkinglot.service.ParkingLotService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("parking")
class ParkingLotController(private val parkingLotService: ParkingLotService) {

    @PostMapping("/create/{levels}/{slots}")
    fun create(@PathVariable("levels") levels : String, @PathVariable("slots") slots: String) : ResponseEntity<CommandResponse> {
        val request = CommandRequest("create");
        request.addInput(levels);
        request.addInput(slots);
        val commandResponse = parkingLotService.processCommand(request);
        return if (commandResponse.success) ResponseEntity.ok(commandResponse) else ResponseEntity.badRequest().body(commandResponse)
    }
}