package org.example
fun main() {
    while (true) {
        print("a coefficient:")
        val a: Double = readln().toDouble()
        print("b coefficient:")
        val b: Double = readln().toDouble()
        print("c coefficient:")
        val c: Double = readln().toDouble()
        val equation = QuadraticEquation(a, b, c)
        val solutions = equation.solve()
        when {
            solutions.isEmpty() -> println("Equation has no real solutions")

            else -> println("Equation has two solutions: x1 = ${solutions[0]}, x2 = ${solutions[1]}")
        }
    }
}