package com.bang.parkinglot.model

import javax.persistence.*

@Entity
@Table(name = "Slot")
class Slot(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int = 0,
        val levelId: Int = 0,
        val levelNumber: Int = 0,
        val slotNumber: Int = 0,
        val vehicleNumber: String? = null,
        val occupied: Boolean = false,
        val available: Boolean = false
)