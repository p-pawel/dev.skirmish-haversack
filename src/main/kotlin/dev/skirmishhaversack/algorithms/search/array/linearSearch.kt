package dev.skirmishhaversack.algorithms.search.array

fun linearSearch(range: ClosedRange<Int>, test: (Int) -> Boolean): Int? {
    val index = (range.start..range.endInclusive)
        .indexOfFirst { i: Int -> test(i) }

    return if (index == -1) null else index;
}