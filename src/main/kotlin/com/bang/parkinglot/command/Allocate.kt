package com.bang.parkinglot.command

import org.springframework.stereotype.Component

@Component
class Allocate : CommandProcessor {
    override fun getType() = CommandType.ALLOCATE

    override fun process(commandRequest: CommandRequest) = CommandResponse("Not Implemented", false)
}