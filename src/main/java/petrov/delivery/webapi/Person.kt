package petrov.delivery.webapi

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable
import java.time.LocalDate

@JsonIgnoreProperties(ignoreUnknown = true)
data class Person(
        val idx: Int? = null,
        val first_name: String? = null,
        val last_name: String? = null,
        val gender: Gender? = null,
        val birth_date: LocalDate? = null,
        val position: Position? = null,
        val emplDate: LocalDate? = null,
        val dismDate: LocalDate? = null,
        val login: String? = null,
        val role: String? = null
): Serializable

