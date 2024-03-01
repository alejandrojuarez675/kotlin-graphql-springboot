package com.alejua.example.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne

@Entity
class StudentSubject(
    @Id val id: String,
    @ManyToOne val student: Student,
    @ManyToOne val subject: Subject,
)
