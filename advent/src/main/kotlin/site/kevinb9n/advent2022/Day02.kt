package site.kevinb9n.advent2022

import com.google.common.collect.Comparators.greatest
import com.google.common.collect.Streams
import java.util.Comparator.naturalOrder
import java.util.stream.Stream
import kotlin.math.max

object Day02 {
  fun part1(real: Boolean): Long {
    var sum = 0L
    Loader.load(2, real).forEachLine {
      sum += it.toLong()
    }
    return sum
  }
}
