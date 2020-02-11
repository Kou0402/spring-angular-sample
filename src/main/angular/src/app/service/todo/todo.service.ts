import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";

import { Todo } from '../../model/todo';

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  constructor(private http: HttpClient) { }

  getTodoList() {
    const apiUrl: string = "http://localhost:8080/todo"
    const result = this.http.get(apiUrl)
    return result
  }
  postTodo(todo: Todo) {
    const apiUrl: string = "http://localhost:8080/todo"
    const result = this.http.post(apiUrl, todo)
    return result
  }
}
