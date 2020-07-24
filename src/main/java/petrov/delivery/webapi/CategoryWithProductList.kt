package petrov.delivery.webapi

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
data class CategoryWithProductList(
        val idx: Int,
        val name: String,
        val productList: List<Product>
): Serializable