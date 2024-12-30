package dev.skirmishhaversack.utils.combinatorics


public fun <T> List<T>.forEachCombination(action: (T, T) -> Unit) {
    // before you refactor it streams, note these loops are a bit faster
    for (i in 0 until this.size) {
        for (j in (i + 1) until this.size) {
            action.invoke(this[i], this[j])
        }
    }
}

public fun <T> List<T>.forEachPermutation(action: (T, T) -> Unit) {
    // before you refactor it streams, note these loops are a bit faster
     for (i in 0 until this.size) {
        for (j in 0 until this.size) {
            if (i != j) {
                action.invoke(this[i], this[j])
            }
        }
    }
}


public fun <T, R> List<T>.mapCombination(action: (T, T) -> R): List<R> {
    val res = ArrayList<R>()
    for (i in 0 until this.size) {
        for (j in (i + 1) until this.size) {
            res.add(action.invoke(this[i], this[j]))
        }
    }
    return res
}

public fun <T> List<T>.mapToCombinations(): List<Pair<T, T>> {
    return this.flatMapIndexed { i, a ->
        this.drop(i + 1).map { b -> a to b }
    }
}

public fun <T> List<T>.mapToPermutations(): List<Pair<T, T>> {
    return this.flatMap { a ->
        this.filter { it != a }
            .map { b -> a to b }
    }
}