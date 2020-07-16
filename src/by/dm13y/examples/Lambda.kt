package by.dm13y.examples

typealias Point = Pair<Int, Int>


class SchedulerContext {
    val str = "32323232323"
    constructor() {
        println("111111111111111111111111111111111$str")
    }

    fun init() {
        print("------------------------------------------------------------------")
    }

    fun data(test : () -> Unit) {
        test()
    }
}

object schedule{
    operator fun invoke(inits: SchedulerContext.() -> Unit) {
        SchedulerContext().init()
        SchedulerContext().inits()
    }
}

fun main() {
    val simpleLambda = { print("test lambda") }

    val pair = Point(1, 1)
    val x = pair.component1()
    val y = pair.component2()


    schedule {
        data {println("ggggggggggggggggggggggggggg")}
    }
}
