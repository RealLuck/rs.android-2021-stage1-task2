package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import java.time.DateTimeException

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            LocalDate.of(year.toInt(), month.toInt(), day.toInt())
                .format(DateTimeFormatter.ofPattern("dd MMMM, EEEE" , Locale("ru")))
        } catch (e: DateTimeException){
            "Такого дня не существует"
        }
    }
}
