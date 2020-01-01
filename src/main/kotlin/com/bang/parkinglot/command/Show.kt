package com.bang.parkinglot.command

import org.springframework.stereotype.Component

@Component
class Show : CommandProcessor {
    override fun getName(): String = "show"

    override fun process(commandRequest: CommandRequest)= CommandResponse("Not Implemented", false)
}