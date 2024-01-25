package org.example

class QuadraticEquation(val a: Double, val b: Double, val c: Double) {


    fun solve(): DoubleArray {
        val discriminant = b * b - 4 * a * c
        return if (discriminant >= 0) {
            var x1 = (-b - Math.sqrt(discriminant)) / (2 * a)
            val x2 = (-b + Math.sqrt(discriminant)) / (2 * a)
            if (x1 == -0.0){
                x1=0.0
            }
            doubleArrayOf(x1, x2)
        }
        else {
            doubleArrayOf()
        }
    }


}