package dev.skirmishhaversack.structures

data class Point(val x: Int, val y: Int) {
    fun moveBy(dx: Int, dy: Int): Point {
        return Point(this.x + dx, this.y + dy)
    }

    operator fun minus(point: Point): Point {
        return Point(this.x - point.x, this.y - point.y)
    }
}
