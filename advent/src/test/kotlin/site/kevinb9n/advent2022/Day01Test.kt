package site.kevinb9n.advent2022

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test
import kotlin.streams.toList

class Day01Test {
  @Test fun testFake() {
    assertThat(Day01.answer(false)).isEqualTo(24000L)
  }

  @Test fun testReal() {
    assertThat(Day01.answer(true)).isEqualTo(70509L)
  }
}
