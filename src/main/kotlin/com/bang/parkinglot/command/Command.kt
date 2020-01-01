package com.bang.parkinglot.command

interface Command {
    fun getName() : String

    fun process(commandRequest: CommandRequest) : CommandResponse
}