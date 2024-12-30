package dev.skirmishhaversack.structures

class SimpleCache<T, R> {
    val cache = mutableMapOf<T, R>()

    fun getOrRun(key: T, function: (T) -> R): R {
        return cache.getOrPut(key) { function.invoke(key) }
    }

    fun getOrRunWithCache(key: T, function: (SimpleCache<T, R>, T) -> R): R {
        return cache.getOrPut(key) { function.invoke(this, key) }
    }

    fun evict() {
        cache.clear();
    }
}