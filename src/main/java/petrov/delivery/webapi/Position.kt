package petrov.delivery.webapi

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
data class Position(
        var idx: Int? = null,
        var name: String? = null,
        var shortName: String? = null
): Serializable