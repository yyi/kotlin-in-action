package ch06.ex1_7_TheLetFunction

fun sendEmailTo(email: String):Unit? {
    println("Sending email to $email")
 //  return null  如果不屏蔽第一次调用就会报错
    return Unit
}

fun main(args: Array<String>) {
    var email: String? = "yole@example.com"
    email?.let { sendEmailTo(it) } ?: throw IllegalArgumentException("should not be null")
    email = null
    email?.let { sendEmailTo(it) } ?: throw IllegalArgumentException("should not be null")
}
