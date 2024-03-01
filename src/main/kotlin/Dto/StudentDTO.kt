package com.alejua.example.Dto

import com.alejua.example.entities.Student
import java.time.LocalDate

class StudentDTO(
    val id: String,
    val name: String,
    val lastname: String,
    val birthdate: LocalDate,
) {
    companion object {
        fun fromEntity(student: Student) = StudentDTO(
            id = student.id,
            name = student.name,
            lastname = student.lastname,
            birthdate = student.birthdate
        )
    }
}
