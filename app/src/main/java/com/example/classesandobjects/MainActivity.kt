package com.example.classesandobjects

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val car1 = Cars("Dacia", "Logan", 2009, 1000)
        val car2 = Cars("Skoda", "Octavia", 2017, 1400)
        val car3 = Cars("Audi", "A4", 2010, 1600)

        car1.drive()
        car1.stop()
        car1.drive()
        car1.stop()
        car1.drive()
        car1.stop()
        car1.drive()
        car1.stop()

        println("Make: ${car1.make}")
        println("Model: ${car1.model}")
        println("Year: ${car1.year}")
        println("Weight: ${car1.weight}")
        println("NeedsMaintenance: ${car1.needsMaintenance}")
        println("TripsSinceMaintenance: ${car1.tripsSinceMaintenance}")

        car2.drive()
        car2.stop()
        car2.drive()
        car2.stop()
        car2.drive()
        car2.stop()
        car2.drive()
        car2.stop()
        car2.drive()
        car2.stop()

        println("Make: ${car2.make}")
        println("Model: ${car2.model}")
        println("Year: ${car2.year}")
        println("Weight: ${car2.weight}")
        println("NeedsMaintenance: ${car2.needsMaintenance}")
        println("TripsSinceMaintenance: ${car2.tripsSinceMaintenance}")

        car3.drive()
        car3.stop()
        car3.drive()
        car3.stop()
        car3.drive()
        car3.stop()
        car3.drive()
        car3.stop()
        car3.drive()
        car3.stop()
        car3.drive()
        car3.stop()
        car3.drive()
        car3.stop()

        println("Make: ${car3.make}")
        println("Model: ${car3.model}")
        println("Year: ${car3.year}")
        println("Weight: ${car3.weight}")
        println("NeedsMaintenance: ${car3.needsMaintenance}")
        println("TripsSinceMaintenance: ${car3.tripsSinceMaintenance}")
    }
}