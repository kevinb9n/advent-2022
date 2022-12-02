package site.kevinb9n.advent2022

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class Day01Test {
  @Test fun part1Fake() {
    assertThat(Day01.part1(false)).isEqualTo(24000L)
  }

  @Test fun part1Real() {
    assertThat(Day01.part1(true)).isEqualTo(70509L)
  }

  @Test fun part2Fake() {
    assertThat(Day01.part2(false)).isEqualTo(45000L)
  }

  @Test fun part2Real() {
    assertThat(Day01.part2(true)).isEqualTo(208567L)
  }
}
