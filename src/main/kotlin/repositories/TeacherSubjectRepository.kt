package com.alejua.example.repositories

import com.alejua.example.entities.TeacherSubject
import org.springframework.data.jpa.repository.JpaRepository

interface TeacherSubjectRepository : JpaRepository<TeacherSubject, String> {
}