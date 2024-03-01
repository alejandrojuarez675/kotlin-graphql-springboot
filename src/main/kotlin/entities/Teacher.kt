package com.alejua.example.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import java.time.LocalDate

@Entity
class Teacher(
    @Id val id: String,
    val name: String,
    val lastname: String,
    val birthdate: LocalDate,
    @OneToMany val teacherSubject: List<TeacherSubject>
)
