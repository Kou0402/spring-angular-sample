import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TodoPostCardComponent } from './todo-post-card.component';

describe('TodoPostCardComponent', () => {
  let component: TodoPostCardComponent;
  let fixture: ComponentFixture<TodoPostCardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TodoPostCardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TodoPostCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
