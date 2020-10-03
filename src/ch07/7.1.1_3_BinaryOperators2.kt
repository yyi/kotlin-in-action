package ch07.ex1_1_3_BinaryOperators2

data class Point(val x: Int, val y: Int)

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Double.times(p: Point): Point {
    return Point((this * p.x).toInt(), (this * p.y).toInt())
}

fun main(args: Array<String>) {
    val p = Point(10, 20)
    println(p * 1.5)
    println(1.5 * p)
}
