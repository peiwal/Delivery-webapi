package petrov.delivery.webapi.api

import petrov.delivery.webapi.ParamRespProduct

// Типизированный интерфейс
interface IMobileClientApiTyped: IMobileClientApi {
    override fun getProducts(): ParamRespProduct
}