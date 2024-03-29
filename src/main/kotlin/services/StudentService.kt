package com.alejua.example.services

import com.alejua.example.Dto.StudentDTO
import com.alejua.example.repositories.SubjectRepository
import org.springframework.stereotype.Service

@Service
class StudentService(
    val subjectRepository: SubjectRepository,
) {
    fun findAllBySubjectCode(subjectCode: String): List<StudentDTO> =
        subjectRepository.findByCode(subjectCode)
            .map { it.studentSubjectList }
            .map { list -> list.map { it.student } }
            .orElse( emptyList() )
            .map { StudentDTO.fromEntity(it) }
}