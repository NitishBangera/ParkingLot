package com.bang.parkinglot.command

import org.springframework.stereotype.Component

@Component
class Create : Command {
    override fun getName() = "create"

    override fun process(commandRequest: CommandRequest): CommandResponse {
        return CommandResponse("Not Implemented", false)
    }
}