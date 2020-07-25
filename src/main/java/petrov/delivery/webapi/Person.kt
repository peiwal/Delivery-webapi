package petrov.delivery.webapi

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable
import java.time.LocalDate

@JsonIgnoreProperties(ignoreUnknown = true)
data class Person(
        val idx: Int,
        val first_name: String,
        val last_name: String,
        val gender: Gender,
        val birth_date: LocalDate,
        val position: Position,
        val emplDate: LocalDate,
        val dismDate: LocalDate,
        val login: String,
        val role: String
): Serializable

