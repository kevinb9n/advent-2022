package site.kevinb9n.advent2022

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test
import kotlin.streams.toList

class Day01Test {
  @Test fun canLoadSource() {
    val lines = Day01.data.lines().toList()
    assertThat(lines[0]).isEqualTo("5557")
  }
}
