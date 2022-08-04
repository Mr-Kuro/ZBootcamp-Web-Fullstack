import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from "@angular/common/http";

import { AppComponent } from './app.component';
import { MarcatextoDirective } from './shared/diretivas/marcatexto.directive';
import { PeopleService } from './shared/services/people.service';
import { ListPeopleComponent } from './shared/components/list-people/list-people.component';
import { ListApiComponent } from './shared/components/list-api/list-api.component';

@NgModule({
  declarations: [
    AppComponent,
    MarcatextoDirective,
    ListPeopleComponent,
    ListApiComponent,
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule 
  ],
  providers: [PeopleService],
  bootstrap: [AppComponent]
})
export class AppModule { }
