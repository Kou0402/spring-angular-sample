import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBarComponent } from './shered/nav-bar/nav-bar.component';
import { TodoComponent } from './pages/todo/todo.component';
import { HomeComponent } from './pages/home/home.component';
import { TodoPostCardComponent } from './components/todo-post-card/todo-post-card.component';
import { TodoCardComponent } from './components/todo-card/todo-card.component';

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    TodoComponent,
    HomeComponent,
    TodoPostCardComponent,
    TodoCardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
