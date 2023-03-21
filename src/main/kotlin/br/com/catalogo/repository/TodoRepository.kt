package br.com.catalogo.repository

import br.com.catalogo.model.Todo
import io.micronaut.data.jpa.repository.JpaRepository

interface TodoRepository: JpaRepository<Todo, Long> {
}