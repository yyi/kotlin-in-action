package ch09.ex3_1_WhyVarianceExists

import java.lang.StringBuilder

fun <T:CharSequence>printContents(list: List<out T>) {
    println(list.joinToString())
}

fun main(args: Array<String>) {
    printContents(listOf<CharSequence>("abc", "bac1111",StringBuilder().apply{
        append("ok")
    }))
}
