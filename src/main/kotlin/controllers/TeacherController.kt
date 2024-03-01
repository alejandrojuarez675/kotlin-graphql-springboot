package com.alejua.example.controllers

import com.alejua.example.services.TeacherService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TeacherController(
    val teacherService: TeacherService,
) {
    @GetMapping("subject/{subject-code}/teacher")
    fun getStudentBySubject(@PathVariable("subject-code") subject: String) =
        teacherService.findAllBySubjectCode(subject)
}