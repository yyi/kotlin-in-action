package ch09.ex1_3_2_TypeParameterConstraints1

fun <T> max(first: T, second: T) : T  where T: Comparable< in T>{
    return if (first > second) first else second
}

fun main(args: Array<String>) {
    println(max("kotlin", "java"))
}
