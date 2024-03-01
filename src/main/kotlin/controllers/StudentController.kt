package com.alejua.example.controllers

import com.alejua.example.services.StudentService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController("")
class StudentController(
   val studentService: StudentService,
) {
    @GetMapping("subject/{subject-code}/student")
    fun getStudentBySubject(@PathVariable("subject-code") subject: String) =
        studentService.findAllBySubjectCode(subject)
}