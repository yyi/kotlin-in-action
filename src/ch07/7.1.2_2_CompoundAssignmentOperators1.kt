package ch07.ex1_2_2_CompoundAssignmentOperators1

import java.util.ArrayList

fun main(args: Array<String>) {
    val numbers = ArrayList<Int>()
    numbers += 42
    (numbers + 42) as ArrayList<Int>
    println(numbers[0])
}
