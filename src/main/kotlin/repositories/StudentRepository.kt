package com.alejua.example.repositories

import com.alejua.example.entities.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository : JpaRepository<Student, String> {
}