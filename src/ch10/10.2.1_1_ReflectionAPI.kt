package ch10.ex2_1_1_ReflectionAPI

import kotlin.reflect.*

class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val person = Person("Alice", 29)
    val kClass = person.javaClass.kotlin
    println(kClass.simpleName)
    kClass.members.forEach { println(it.name) }
}
