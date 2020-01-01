package com.bang.parkinglot.command

import java.util.*

class CommandRequest(val command: String) {
    private val inputs: MutableList<String> = LinkedList()

    fun addInput(input: String) {
        inputs.add(input)
    }

    fun getInputs() = Collections.unmodifiableList(inputs)
}