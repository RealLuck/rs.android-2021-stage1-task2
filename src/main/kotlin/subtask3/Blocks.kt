package subtask3

import java.lang.StringBuilder
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass


class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when(blockB){
            String::class-> {
                var string = StringBuilder()
                (blockA.filterIsInstance<String>()).forEach { str-> string.append(str) }
                string.toString()
            }
            Int::class-> {
                (blockA.filterIsInstance<Int>()).sum()
            }
            LocalDate::class -> {
                (blockA.filterIsInstance<LocalDate>()).minBy{ date->
                    kotlin.math.abs(
                        date.compareTo(
                            LocalDate.now()
                        )
                    )
                }?.format(
                    DateTimeFormatter.ofPattern("dd.MM.yyyy"))!!
            }
            else -> throw IllegalArgumentException()            }
    }
}

