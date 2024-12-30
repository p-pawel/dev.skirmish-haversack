package dev.skirmishhaversack.utils.execution



public fun <T> wrapWithMetrics(label: String, input: T, function: (T) -> String): String {
    val startTime = System.currentTimeMillis()
    val result = function.invoke(input)
    val endTime = System.currentTimeMillis()

    println("$label: $result")
    println("Execution time: ${endTime - startTime} ms")
    return result
}
