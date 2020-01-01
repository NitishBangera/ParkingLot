package com.bang.parkinglot.command

import org.springframework.stereotype.Component

@Component
class Use : Command {
    override fun getName()= "use"

    override fun process(commandRequest: CommandRequest)= CommandResponse("Not Implemented", false)
}