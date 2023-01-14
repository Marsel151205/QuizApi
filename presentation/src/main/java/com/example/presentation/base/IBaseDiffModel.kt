package com.example.presentation.base

interface IBaseDiffModel<T> {
    val id: T
    override fun equals(other: Any?): Boolean
}