package petrov.delivery.webapi

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
data class Position(
        val idx: Int? = null,
        val name: String? = null,
        val short_name: String? = null
): Serializable