package ch02.ex3_7_WhenBlockBranch

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
class Multi(val left: Expr, val right: Expr) : Expr

fun evalWithLogging(e: Expr): Int =
        when (e) {
            is Num -> {
                println("num: ${e.value}")
                e.value
            }
            is Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("sum: $left + $right")
                left + right
            }
            is Multi ->{
                var left = evalWithLogging(e.left)
                var right = evalWithLogging(e.right)
                 left * right
            }
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun main(args: Array<String>) {
    println(evalWithLogging(Sum(Multi(Num(1), Num(2)), Num(4))))
}
