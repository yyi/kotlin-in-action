package geometry.shapes

import java.util.Random

class Rectangle(val height: Int, val width: Int) {
    var isSquare: Boolean
        get() = height == width
        set(x: Boolean) = print("test")
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}
