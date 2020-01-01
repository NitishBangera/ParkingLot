package com.bang.parkinglot.command

import org.springframework.stereotype.Component

@Component
class Use : CommandProcessor {
    override fun getType() = CommandType.USE

    override fun process(commandRequest: CommandRequest)= CommandResponse("Not Implemented", false)
}