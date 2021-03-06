package petrov.delivery.webapi

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable
import java.math.BigDecimal

@JsonIgnoreProperties(ignoreUnknown = true)
data class Product(
        val idx: Int,
        val name: String,
        val description: String,
        val ingredients: String,
        val imgUrl: String,
        val cost: BigDecimal
): Serializable