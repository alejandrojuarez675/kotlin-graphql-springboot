package com.alejua.example.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne

@Entity
class TeacherSubject(
    @Id val id: String,
    @ManyToOne val teacher: Teacher,
    @ManyToOne val subject: Subject,
)
