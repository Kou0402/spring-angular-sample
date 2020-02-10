import { Component, OnInit } from '@angular/core';

import { Todo } from '../../model/todo';
import { TodoService } from '../../service/todo/todo.service';

@Component({
  selector: 'app-todo-card',
  templateUrl: './todo-card.component.html',
  styleUrls: ['./todo-card.component.scss']
})
export class TodoCardComponent implements OnInit {

  // todo = new Todo(null, null, null, null)
  todoList: Todo[]

  constructor( private todoService: TodoService ) { }

  ngOnInit() {
    this.getTodo()
  }

  getTodo() {
    this.todoService.getTodoList().subscribe((data: Todo[]) => {
      this.todoList = data
      // console.log(data)
    })
  }

}
