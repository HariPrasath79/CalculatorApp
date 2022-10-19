package com.example.calculator

sealed class CalculatorOperations(val symbol: String) {
    object Add: CalculatorOperations("+")
    object Multiply : CalculatorOperations("*")
    object Subraction : CalculatorOperations("-")
    object Divide : CalculatorOperations("/")


}
