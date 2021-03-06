package com.bang.parkinglot.service

import com.bang.parkinglot.command.CommandFactory
import com.bang.parkinglot.command.CommandRequest
import com.bang.parkinglot.command.CommandResponse
import com.bang.parkinglot.command.CommandType
import org.springframework.stereotype.Service

@Service
class ParkingLotService(private val commandFactory: CommandFactory) {
    fun processCommand(commandRequest: CommandRequest) : CommandResponse {
        val inputCommand: CommandType = commandRequest.commandType
        val commandProcessor = commandFactory.getCommandProcessor(inputCommand)
        return commandProcessor?.process(commandRequest) ?: CommandResponse("Invalid command : $inputCommand", false)
    }
}