package ch10.ex2_1_1_ReflectionAPI

import kotlin.reflect.KProperty

class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val person = Person("Alice", 29)
    val kClass = person.javaClass.kotlin
    println(kClass.simpleName)
    kClass.members.filterIsInstance<KProperty<*>>().forEach { println(it.name) }
    println("${sun.font.X11TextRenderer::class.java}  ${sun.font.X11TextRenderer::class.java.kotlin}  ${java.lang.String::class.java}    ${java.lang.String::class.java.kotlin}")
}
