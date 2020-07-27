package petrov.delivery.webapi

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable
import java.time.LocalDate

@JsonIgnoreProperties(ignoreUnknown = true)
data class Person(
        var idx: Int? = null,
        var first_name: String? = null,
        var last_name: String? = null,
        var gender: Gender? = null,
        var birth_date: LocalDate? = null,
        var position: Position? = null,
        var emplDate: LocalDate? = null,
        var dismDate: LocalDate? = null,
        var login: String? = null,
        var role: String? = null
): Serializable

