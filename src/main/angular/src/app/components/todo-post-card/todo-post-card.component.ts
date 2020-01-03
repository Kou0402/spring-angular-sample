import { Component, OnInit } from '@angular/core';

import { Todo } from '../../model/todo';

@Component({
  selector: 'app-todo-post-card',
  templateUrl: './todo-post-card.component.html',
  styleUrls: ['./todo-post-card.component.scss']
})
export class TodoPostCardComponent implements OnInit {

  model = new Todo(null, null, null)

  constructor() { }

  ngOnInit() {
  }

}
