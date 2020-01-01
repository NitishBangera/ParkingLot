package com.bang.parkinglot.command

interface CommandProcessor {
    fun getType() : CommandType

    fun process(commandRequest: CommandRequest) : CommandResponse
}