package dev.skirmishhaversack.algorithms.search.path

import dev.skirmishhaversack.structures.CharMap2D
import dev.skirmishhaversack.structures.Point
import dev.skirmishhaversack.utils.geometry.manhattanDistance

class CharMapNodeProvider(val map: CharMap2D, val obstacle: Char) : GridProvider {

    override fun getNeighbors(current: Point): List<Point> {
        return listOf(Pair(1, 0), Pair(-1, 0), Pair(0, 1), Pair(0, -1))
            .map { (x, y) -> current.moveBy(x, y) }
            .filter { map.isWithin(it) }
            .filter { map.charAt(it) != obstacle }
    }

    override fun getCost(
        p1: Point,
        p2: Point
    ): Double {
        return manhattanDistance(p1, p2)
    }

    override fun getHeuristic(
        p1: Point,
        p2: Point
    ): Double {
        return manhattanDistance(p1, p2)
    }

}

