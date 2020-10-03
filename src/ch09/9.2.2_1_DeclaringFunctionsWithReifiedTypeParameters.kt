package ch09.ex2_2_1_DeclaringFunctionsWithReifiedTypeParameters

inline fun <reified T> isA(value: Any) = value is T

inline fun <reified T> createA():T = T::class.constructors.iterator().next().call()

fun main(args: Array<String>) {
    println(isA<String>("abc"))
    println(isA<String>(123))
    println(createA<String>())
//    println(createA<Int>())
}
