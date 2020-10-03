package ch07.ex2_1_EqualityOperators

class Point(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        val obj2 = other as? Point ?: return false
        return obj2.x == x && obj2.y == y
    }
}

fun main(args: Array<String>) {
    println(Point(10, 20) == Point(10, 20))
    println(Point(10, 20) != Point(5, 5))
    println(null == Point(1, 2))
}
