package site.kevinb9n.advent2022

import kotlin.math.max

object Day01 {
  fun answer(real: Boolean): Long {
    var total = 0L
    var highest = 0L
    Loader.load(1, real).forEachLine {
      if (it.isNotEmpty()) {
        total += it.toLong()
        highest = max(highest, total)
      } else {
        total = 0
      }
    }
    return highest
  }
}
