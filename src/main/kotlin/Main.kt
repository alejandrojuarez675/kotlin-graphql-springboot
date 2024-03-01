package com.alejua.example

import com.alejua.example.entities.Student
import com.alejua.example.entities.StudentSubject
import com.alejua.example.entities.Subject
import com.alejua.example.entities.Teacher
import com.alejua.example.entities.TeacherSubject
import com.alejua.example.repositories.StudentRepository
import com.alejua.example.repositories.StudentSubjectRepository
import com.alejua.example.repositories.SubjectRepository
import com.alejua.example.repositories.TeacherRepository
import com.alejua.example.repositories.TeacherSubjectRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.time.LocalDate
import java.util.*


@SpringBootApplication
class DemoApplication {
    @Bean
    fun commandLineRunner(
        studentRepository: StudentRepository,
        subjectRepository: SubjectRepository,
        studentSubjectRepository: StudentSubjectRepository,
        teacherRepository: TeacherRepository,
        teacherSubjectRepository: TeacherSubjectRepository,
    ): CommandLineRunner {
        return CommandLineRunner { args: Array<String?>? ->
            val students = listOf(
                Student(
                    id = "aaa001",
                    name = "ale",
                    lastname = "juarez",
                    birthdate = LocalDate.of(1994, 5, 10),
                    studentSubject = emptyList()
                ),Student(
                    id = "aaa002",
                    name = "juli",
                    lastname = "robles",
                    birthdate = LocalDate.of(1992, 5, 30),
                    studentSubject = emptyList()
                ),
            )
            students.forEach { studentRepository.save(it) }

            val subject = Subject(
                id = "123sdf",
                code = "MATE1",
                name = "Calculo en una variable",
                studentSubjectList = emptyList(),
                teacherSubjectList = emptyList()
            )
            subjectRepository.save(subject)

            studentSubjectRepository.save(StudentSubject("aaa001", students[0], subject))
            studentSubjectRepository.save(StudentSubject("aaa002", students[1], subject))

            val teachers = listOf(
                Teacher(
                    id = "aaa001",
                    name = "pablo",
                    lastname = "briguez",
                    birthdate = LocalDate.of(1982, 6, 30),
                    teacherSubject = emptyList(),
                )
            )
            teachers.forEach{ teacherRepository.save(it) }

            teacherSubjectRepository.save(TeacherSubject("aaa001", teachers[0], subject))
        }
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}

