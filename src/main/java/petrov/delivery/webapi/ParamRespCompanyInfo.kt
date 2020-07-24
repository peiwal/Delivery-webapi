package petrov.delivery.webapi

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
data class ParamRespCompanyInfo(
        val places: List<CompanyPlace>,
        val name: String,
        val phone: String,
        val email: String
): Serializable