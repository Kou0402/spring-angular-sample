import { Component, OnInit } from "@angular/core";
import { HttpClient } from "@angular/common/http";

import { Todo } from "../../model/todo";

@Component({
  selector: "app-todo-post-card",
  templateUrl: "./todo-post-card.component.html",
  styleUrls: ["./todo-post-card.component.scss"]
})
export class TodoPostCardComponent implements OnInit {
  model = new Todo(null, null, null);

  constructor(private http: HttpClient) {}

  ngOnInit() {}

  async onClick() {
    const apiUrl: string = "http://localhost:8080/todo"
    const result = await this.http.get(apiUrl)
    result.subscribe(data => {
      console.log(data)
    })
  }

}
