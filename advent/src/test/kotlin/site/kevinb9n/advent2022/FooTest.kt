package site.kevinb9n.advent2022

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class FooTest {
  @Test fun bar() {
    assertThat(Foo.bar).isEqualTo("qux");
  }
}
