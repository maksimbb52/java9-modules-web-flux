package com.example.demo.service.impl

import com.example.demo.custom.InitNotify
import com.example.demo.dao.UserRepository
import com.example.demo.mapper.UserMapper
import com.example.demo.model.UserModel
import com.example.demo.service.KotlinService

//  Внедрение компонентов через конструктор
//  (настроено в java-config'е)

class KotlinServiceImpl(
        private val userMapper: UserMapper,
        private val userRepository: UserRepository
) : KotlinService, InitNotify {

    override fun findAll(): List<UserModel> {

//        Аналог Stream из Java

        return userRepository.findAll()
                .map { userMapper.entityToModel(it)}
    }
}