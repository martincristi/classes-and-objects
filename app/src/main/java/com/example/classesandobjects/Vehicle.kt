package com.example.classesandobjects

open class Vehicle(val make: String, val model: String, val year: Int, val weight: Int) {
    var needsMaintenance: Boolean = false
    var tripsSinceMaintenance: Int = 0
}