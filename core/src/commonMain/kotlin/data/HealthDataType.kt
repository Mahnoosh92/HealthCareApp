package data

sealed interface HealthDataType {
    data object Steps : HealthDataType

    data object Weight : HealthDataType
}