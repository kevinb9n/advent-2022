package site.kevinb9n.advent2022

import site.kevinb9n.advent2022.Day02.Shape.PAPER
import site.kevinb9n.advent2022.Day02.Shape.ROCK
import site.kevinb9n.advent2022.Day02.Shape.SCISSORS

object Day02 {
  fun part1(real: Boolean): Long {
    var sum = 0L
    Loader.load(2, real).forEachLine {
      val theirs = letterToShape(it[0])
      val mine = letterToShape(it[2])
      val outcome = mine.outcomeAgainst(theirs)
      val points = mine.points + outcome.points
      // println("$it $points")
      sum += points
    }
    return sum
  }

  enum class Shape(val points: Int) { ROCK(1), PAPER(2), SCISSORS(3) }
  enum class Outcome(val points: Int) { LOSE(0), DRAW(3), WIN(6) }

  fun Shape.outcomeAgainst(other: Shape): Outcome {
    return Outcome.values()[(ordinal - other.ordinal + 1).mod(3)]
  }

  fun letterToShape(letter: Char) =
    when (letter) {
      'A', 'X' -> ROCK
      'B', 'Y' -> PAPER
      'C', 'Z' -> SCISSORS
      else -> error("")
    }
}
