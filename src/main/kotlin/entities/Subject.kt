package com.alejua.example.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
class Subject(
    @Id val id: String,
    val code: String,
    val name: String,
    @OneToMany(mappedBy = "subject") val studentSubjectList: List<StudentSubject>,
    @OneToMany(mappedBy = "subject") val teacherSubjectList: List<TeacherSubject>,
)
