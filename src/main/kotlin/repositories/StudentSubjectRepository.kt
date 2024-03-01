package com.alejua.example.repositories

import com.alejua.example.entities.StudentSubject
import org.springframework.data.jpa.repository.JpaRepository

interface StudentSubjectRepository : JpaRepository<StudentSubject, String> {
}