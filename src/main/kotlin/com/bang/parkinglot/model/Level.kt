package com.bang.parkinglot.model

import javax.persistence.*

@Entity
@Table(name = "Level")
class Level (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Int = 0,
        val parkingLotId: Int = 0,
        val levelNumber: Int = 0
)