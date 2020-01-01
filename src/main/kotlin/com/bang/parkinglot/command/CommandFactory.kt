package com.bang.parkinglot.command

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CommandFactory {
    private val commands: MutableMap<String, CommandProcessor> = HashMap()

    @Autowired
    constructor(commandProcessors: List<CommandProcessor>) {
        for (commandProcessor in commandProcessors) commands[commandProcessor.getName()] = commandProcessor
    }

    fun getCommandProcessor(command: String) = commands[command]
}