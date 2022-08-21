import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from "@angular/forms"; //importei

import { AppComponent } from './app.component';
import { courseListComponent } from './courses/course-list.component';

@NgModule({
  declarations: [
    AppComponent,
    courseListComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
