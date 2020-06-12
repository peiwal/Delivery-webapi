package petrov.delivery.webapi

interface IMobileClientApi {
    // Запрос списка продуктов
    fun getProducts(): ParamRespProducts
}