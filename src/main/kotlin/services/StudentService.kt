package com.alejua.example.services

import com.alejua.example.Dto.StudentDTO
import com.alejua.example.repositories.StudentRepository
import com.alejua.example.repositories.SubjectRepository
import org.springframework.stereotype.Service

@Service
class StudentService(
    val studentRepository: StudentRepository,
    val subjectRepository: SubjectRepository,
) {
    fun findAllBySubjectCode(subjectCode: String): List<StudentDTO> =
        subjectRepository.findByCode(subjectCode)
            .also { System.out.printf("Find %s for code %s%n", it.map { it1 -> it1.name }, subjectCode) }
            .map { it.studentSubjectList }
            .also { System.out.printf("Find studentSubjectList %s for code %s%n", it, subjectCode) }
            .map { list -> list.map { it.student } }
            .also { System.out.printf("Find student %s for code %s%n", it, subjectCode) }
            .orElse( emptyList() )
            .map { StudentDTO.fromEntity(it) }
}