import { Component, OnInit } from '@angular/core';

import { Todo } from '../../model/todo';

@Component({
  selector: 'app-todo-card',
  templateUrl: './todo-card.component.html',
  styleUrls: ['./todo-card.component.scss']
})
export class TodoCardComponent implements OnInit {

  model = new Todo(null, null, null)

  constructor() { }

  ngOnInit() {
  }

}
