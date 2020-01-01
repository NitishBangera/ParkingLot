package com.bang.parkinglot.command

import com.fasterxml.jackson.annotation.JsonIgnore
import java.util.*
import kotlin.collections.LinkedHashMap

class CommandResponse(val message: String, @JsonIgnore val success : Boolean = true) {
    private val output: MutableMap<String, Any> = LinkedHashMap()

    fun addOutput(key: String, value: Any) {
        output[key] = value
    }

    fun getOutput() : Map<String, Any> = Collections.unmodifiableMap(output)
}