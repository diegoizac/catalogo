package br.com.catalogo.rest

import br.com.catalogo.model.Todo
import br.com.catalogo.repository.TodoRepository

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller("/todos")
class TodoController(private val todoRepository: TodoRepository) {
    @Get
    fun getTodos(): List<Todo> {
        return todoRepository.findAll()
    }

    @Post
    fun addTodo(todo: Todo): Todo {
        return todoRepository.save(todo)
    }
}