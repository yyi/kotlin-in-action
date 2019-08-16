package ch06.ex1_3_1_SafeCallOperator

fun printAllCaps(s: String?) {
    val allCaps: String = s?.toUpperCase() ?: "empty"
    println(allCaps)
}

fun main(args: Array<String>) {
    printAllCaps("abc")
    printAllCaps(null)
}
