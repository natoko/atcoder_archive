fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val ans = a*b
    if (ans%2 == 0) print("Even")
    else print("Odd")
}