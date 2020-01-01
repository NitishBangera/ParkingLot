package com.bang.parkinglot.command

interface CommandProcessor {
    fun getName() : String

    fun process(commandRequest: CommandRequest) : CommandResponse
}