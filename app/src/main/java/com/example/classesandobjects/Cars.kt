package com.example.classesandobjects

class Cars(make: String, model: String, year: Int, weight: Int): Vehicle(make, model, year, weight) {
    var isDriving: Boolean = false
    fun drive(){
        isDriving = true
    }
    fun stop(){
        tripsSinceMaintenance += 1
        isDriving = false
        if(tripsSinceMaintenance == 100) {
            needsMaintenance = true
        }
        if(needsMaintenance == true){
            repair()
        }
    }
    fun repair(){
        tripsSinceMaintenance = 0
        needsMaintenance = false
    }
}
