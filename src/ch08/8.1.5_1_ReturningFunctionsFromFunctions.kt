package ch08.ex1_5_1_ReturningFunctionsFromFunctions

enum class Delivery { STANDARD, EXPEDITED }

class Order(val itemCount: Int)

fun getShippingCostCalculator(
        delivery: Delivery): (Order) -> Double {
    return when (delivery) {
        Delivery.EXPEDITED -> { order -> 6 + 2.1 * order.itemCount }
        Delivery.STANDARD -> { order -> 1.2 * order.itemCount }
    }
}

fun main(args: Array<String>) {
    val calculator =
            getShippingCostCalculator(Delivery.EXPEDITED)
    println("Shipping costs ${calculator(Order(3))}")
    println("Shipping costs ${getShippingCostCalculator(Delivery.STANDARD)(Order(3))}")
}
