package com.mbobiosio.datastructures.linkedlist

/*
* Created by Mbuodile Obiosio on Jun 26, 2021.
* Twitter: @cazewonder
* Nigeria
*/
class AddTwoIntegers {

    /*
     * Given head pointers of two linked lists where each linked list represents an integer number
     * (each node is a digit), add them and return the resulting linked list.
     * Input: List1: 1,2,3  List: 1,2
     * Output: 2, 4, 3
     *
     * Runtime Complexity:
     * Linear, O(n)
     *
     * Memory Complexity:
     * Constant, O(1)
     *
     * Add the integers 9901 and 237. The result of this addition would be 10138.
     * */

    /*
     * Given head pointers of two linked lists where each linked list represents an integer number
     * (each node is a digit), add them and return the resulting linked list.
     * Input: List1: 1,2,3  List: 1,2
     * Output: 2, 4, 3
     *
     * Runtime Complexity:
     * Linear, O(n)
     *
     * Memory Complexity:
     * Constant, O(1)
     *
     * Add the integers 9901 and 237. The result of this addition would be 10138.
     * */

    private fun addTwoNumbers(a: IntArray, b: IntArray): Iterable<Int> {
        val result = mutableListOf<Int>()
        var remainder = 0
        for (i in 0 until a.size.coerceAtLeast(b.size)) {
            val sum = a.getOrElse(i) { 0 } + b.getOrElse(i) { 0 } + remainder
            remainder = if (sum >= 10) 1 else 0
            result += if (remainder == 1) sum - 10 else sum
        }
        if (remainder == 1) result.add(1)
        return result
    }

    fun main(a: IntArray, b: IntArray) {
        println(addTwoNumbers(a, b))
    }
}