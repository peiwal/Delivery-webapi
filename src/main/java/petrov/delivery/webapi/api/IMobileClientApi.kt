package petrov.delivery.webapi.api

import petrov.delivery.webapi.ParamRespCompanyInfo
import petrov.delivery.webapi.ParamRespProduct

interface IMobileClientApi {
    // Запрос списка продуктов
    fun getProducts(): ParamRespProduct
    
    // Запрос данных о компании
    fun getCompanyInfo(): ParamRespCompanyInfo
}