package com.bang.parkinglot.model

import javax.persistence.*

@Entity
@Table(name = "parking_lot")
class ParkingLot(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int,
        var name: String
)