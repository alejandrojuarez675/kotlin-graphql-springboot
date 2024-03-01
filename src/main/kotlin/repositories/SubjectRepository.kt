package com.alejua.example.repositories

import com.alejua.example.entities.Subject
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface SubjectRepository : JpaRepository<Subject, String> {

    fun findByCode(code: String): Optional<Subject>

}