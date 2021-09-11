package org.prudentia

import kotlinx.serialization.Serializable

@Serializable
data class UserDTO(
    val username: String,
    val name: String,
    val registrationTime: Long
)

@Serializable
data class UserCreateDTO(
    val username: String,
    val name: String
)

@Serializable
data class UserUpdateDTO(
    val username: String? = null,
    val name: String? = null
)