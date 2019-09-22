package com.example.demo.service

import com.example.demo.model.UserModel

interface KotlinService {

    fun findAll() : List<UserModel>
}