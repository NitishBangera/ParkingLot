package com.bang.parkinglot.command

import org.springframework.stereotype.Component

@Component
class Allocate : Command {
    override fun getName(): String = "allocate"

    override fun process(commandRequest: CommandRequest) = CommandResponse("Not Implemented", false)
}