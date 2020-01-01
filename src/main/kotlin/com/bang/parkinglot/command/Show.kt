package com.bang.parkinglot.command

import org.springframework.stereotype.Component

@Component
class Show : Command {
    override fun getName(): String = "show"

    override fun process(commandRequest: CommandRequest)= CommandResponse("Not Implemented", false)
}