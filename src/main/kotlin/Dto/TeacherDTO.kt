package com.alejua.example.Dto

import com.alejua.example.entities.Teacher
import java.time.LocalDate

data class TeacherDTO(
    val id: String,
    val name: String,
    val lastname: String,
    val birthdate: LocalDate,
) {
    companion object {
        fun fromEntity(teacher: Teacher) = TeacherDTO(
            id = teacher.id,
            name = teacher.name,
            lastname = teacher.lastname,
            birthdate = teacher.birthdate
        )
    }
}
