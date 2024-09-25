package com.example.compose.demo_cicd

import Calculator
import org.junit.Test
import org.junit.Assert.*


class CalculatorTest {
    private var calculator: Calculator = Calculator()

    @Test
    fun addition_isCorrect() {
        assertEquals(4, calculator.add(2, 2))
    }

    @Test
    fun subtraction_isCorrect() {
        assertEquals(0, calculator.subtract(2, 2))
    }
}