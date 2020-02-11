import { Component, OnInit } from "@angular/core";
import { HttpClient } from "@angular/common/http";

import { Todo } from "../../model/todo";
import { TodoService } from "../../service/todo/todo.service";

@Component({
  selector: "app-todo-post-card",
  templateUrl: "./todo-post-card.component.html",
  styleUrls: ["./todo-post-card.component.scss"]
})
export class TodoPostCardComponent implements OnInit {
  todo: Todo = new Todo(null, null, null, null);

  constructor(private http: HttpClient, private todoService: TodoService) {}

  ngOnInit() {}

  postTodo() {
    this.todoService.postTodo(this.todo).subscribe(
      data => {
        console.log(data);
      },
      error => {
        console.log(error);
      }
    );
  }
}
