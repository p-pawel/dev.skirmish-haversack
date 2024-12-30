package dev.skirmishhaversack.utils.geometry

import dev.skirmishhaversack.structures.Point
import kotlin.math.abs

fun manhattanDistance(start: Point, goal: Point): Double {
    return abs(start.x - goal.x).toDouble() + abs(start.y - goal.y).toDouble()
}