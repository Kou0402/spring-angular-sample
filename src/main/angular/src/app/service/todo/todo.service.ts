import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";

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
}
