import { Component, OnInit } from '@angular/core';
import { PeopleService } from './shared/services/people.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  count: number = 0;
  nome= 'Hannah Hope'
  text:string='';

  pessoas = [
    {
      firstName: 'Anderson',
      lastName: 'Queiroz',
      age: '20',
    },
  ];

  constructor(private PeopleService:PeopleService){
    //injetei o PeopleService aqui
  };

  ngOnInit(): void {
    this.getPeaple()
    console.log(this.pessoas);
    let interval = setInterval(():void => {
      this.count ++;
      if(this.count === 10){
        clearInterval(interval);
      } 
    }, 1000);
  }
  

  clicou(nome:string): void{
      console.log('clicou em mim', nome)
    }

  getPeaple(){
    this.PeopleService.getPeople().subscribe((people: any) => {
      this.pessoas = people;
    })
  }

}
