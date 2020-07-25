package petrov.delivery.webapi

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
data class Position(
        val idx: Int,
        val name: String,
        val short_name: String
): Serializable