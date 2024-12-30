package dev.skirmishhaversack.utils.io

public fun readAllLines(): List<String> = generateSequence { readlnOrNull() }.toList()
