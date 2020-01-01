package com.bang.parkinglot.command

import org.springframework.stereotype.Component

@Component
class DeAllocate : CommandProcessor {
    override fun getName(): String = "deallocate"

    override fun process(commandRequest: CommandRequest)= CommandResponse("Not Implemented", false)
}