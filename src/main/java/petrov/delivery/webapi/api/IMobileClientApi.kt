package petrov.delivery.webapi.api

// Без типа возвращаемого значения
interface IMobileClientApi {
    // Запрос списка продуктов
    fun getProducts(): Any
}