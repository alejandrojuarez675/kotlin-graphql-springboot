package com.alejua.example.repositories

import com.alejua.example.entities.Teacher
import org.springframework.data.jpa.repository.JpaRepository

interface TeacherRepository : JpaRepository<Teacher, String> {
}