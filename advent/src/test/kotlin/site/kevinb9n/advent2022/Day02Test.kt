package site.kevinb9n.advent2022

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test
import site.kevinb9n.advent2022.Day02.Outcome.DRAW
import site.kevinb9n.advent2022.Day02.Outcome.LOSE
import site.kevinb9n.advent2022.Day02.Outcome.WIN
import site.kevinb9n.advent2022.Day02.Shape.PAPER
import site.kevinb9n.advent2022.Day02.Shape.ROCK
import site.kevinb9n.advent2022.Day02.Shape.SCISSORS
import site.kevinb9n.advent2022.Day02.outcomeAgainst

class Day02Test {
  @Test fun theGame() {
    assertThat(ROCK.outcomeAgainst(ROCK)).isEqualTo(DRAW)
    assertThat(ROCK.outcomeAgainst(PAPER)).isEqualTo(LOSE)
    assertThat(ROCK.outcomeAgainst(SCISSORS)).isEqualTo(WIN)
    assertThat(PAPER.outcomeAgainst(ROCK)).isEqualTo(WIN)
    assertThat(PAPER.outcomeAgainst(PAPER)).isEqualTo(DRAW)
    assertThat(PAPER.outcomeAgainst(SCISSORS)).isEqualTo(LOSE)
    assertThat(SCISSORS.outcomeAgainst(ROCK)).isEqualTo(LOSE)
    assertThat(SCISSORS.outcomeAgainst(PAPER)).isEqualTo(WIN)
    assertThat(SCISSORS.outcomeAgainst(SCISSORS)).isEqualTo(DRAW)
  }

  @Test fun part1Fake() {
    assertThat(Day02.part1(false)).isEqualTo(15L)
  }

  @Test fun part1Real() {
    assertThat(Day02.part1(true)).isEqualTo(13439L) // but this is wrong
  }
}
