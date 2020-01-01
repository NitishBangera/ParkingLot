package com.bang.parkinglot.command

import org.springframework.stereotype.Component

@Component
class Show : CommandProcessor {
    override fun getType() = CommandType.SHOW

    override fun process(commandRequest: CommandRequest)= CommandResponse("Not Implemented", false)
}