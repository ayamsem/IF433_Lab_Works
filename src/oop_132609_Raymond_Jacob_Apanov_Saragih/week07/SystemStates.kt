package oop_132609_Raymond_Jacob_Apanov_Saragih.week07

enum class AppState {
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse {
    data class Success(val data: AppState) : ApiResponse()
    data class Failure(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}