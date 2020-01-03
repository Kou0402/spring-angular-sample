import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBarComponent } from './shered/nav-bar/nav-bar.component';
import { TodoComponent } from './pages/todo/todo.component';
import { HomeComponent } from './pages/home/home.component';
import { TodoPostCardComponent } from './components/todo-post-card/todo-post-card.component';

@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    TodoComponent,
    HomeComponent,
    TodoPostCardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
