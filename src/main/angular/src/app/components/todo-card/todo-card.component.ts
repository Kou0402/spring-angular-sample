import { Component, OnInit } from '@angular/core';

import { Todo } from '../../model/todo';
import { TodoService } from '../../service/todo/todo.service';

@Component({
  selector: 'app-todo-card',
  templateUrl: './todo-card.component.html',
  styleUrls: ['./todo-card.component.scss']
})
export class TodoCardComponent implements OnInit {

  todoList: Todo[]

  constructor( private todoService: TodoService ) { }

  ngOnInit() {
    this.setTodoList()
  }

  setTodoList() {
    this.todoService.getTodoList().subscribe((data: Todo[]) => {
      this.todoList = data
    })
  }

}
