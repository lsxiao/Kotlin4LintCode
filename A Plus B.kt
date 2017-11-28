/**
 * 不能使用加减乘除数学运算符号
 */


/**
 * 递归解法
 */
fun plus(a: Int, b: Int): Int {

    if (b == 0) {
        return a
    }

    //不考虑进位
    val sum = a xor b

    //只考虑进位
    val carry = (a and b) shl 1

    return plus(sum, carry)
}

fun main(args: Array<String>) {
    println(plus(1, 5) == 1 + 5)
    println(plus(3, 6) == 3 + 6)
    println(plus(4, 4) == 4 + 4)
    println(plus(7, -1) == 7 + (-1))
    println(plus(-1, -1) == -1 + (-1))
}