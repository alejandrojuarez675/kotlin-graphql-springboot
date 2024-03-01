package com.alejua.example.services

import com.alejua.example.Dto.TeacherDTO
import com.alejua.example.repositories.SubjectRepository
import org.springframework.stereotype.Service

@Service
class TeacherService(
    val subjectRepository: SubjectRepository,
) {
    fun findAllBySubjectCode(subjectCode: String): List<TeacherDTO> =
        subjectRepository.findByCode(subjectCode)
            .map { it.teacherSubjectList }
            .map { list -> list.map { it.teacher } }
            .orElse( emptyList() )
            .map { TeacherDTO.fromEntity(it) }
}