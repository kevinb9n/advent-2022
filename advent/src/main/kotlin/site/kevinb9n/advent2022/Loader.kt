package site.kevinb9n.advent2022

import com.google.common.io.ByteSource
import com.google.common.io.CharSource
import java.io.InputStream
import java.nio.charset.StandardCharsets.UTF_8

object Loader {
  fun load(day: Int, real: Boolean): CharSource {
    val dayStr = if (day < 10) "0$day" else "$day"
    val which = if (real) "real" else "fake"
    val resource = javaClass.getResource("/day$dayStr.$which.txt")!!
    return object : ByteSource() {
      override fun openStream(): InputStream {
        return resource.openStream()
      }
    }.asCharSource(UTF_8)
  }
}
