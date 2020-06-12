package petrov.delivery.webapi

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.math.BigDecimal

@JsonIgnoreProperties(ignoreUnknown = true)
data class Product(val idx: Int,
                   val name: String,
                   val description: String,
                   val price: BigDecimal,
                   val imageUrl: String)