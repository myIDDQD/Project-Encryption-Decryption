fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val max = if (a < b) b else a
    println(max)
}