package site.kevinb9n.advent2022

import com.google.common.collect.Comparators.greatest
import com.google.common.collect.Streams
import java.util.Comparator.naturalOrder
import java.util.stream.Stream
import kotlin.math.max

object Day01 {
  fun part1(real: Boolean): Long {
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

  private val GREATEST_3_COLLECTOR = greatest<Long>(3, naturalOrder())

  fun part2(real: Boolean): Long {
    var total = 0L
    val list = mutableListOf<Long>()
    val source = Loader.load(1, real)
    Streams.concat(source.lines(), Stream.of("")).forEach {
      if (it.isNotEmpty()) {
        total += it.toLong()
      } else {
        list.add(total)
        total = 0
      }
    }
    val greatest3: List<Long> = list.stream().collect(GREATEST_3_COLLECTOR)
    return greatest3.stream().mapToLong { it }.sum()
  }
}
