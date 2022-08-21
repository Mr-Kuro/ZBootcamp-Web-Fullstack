import { Component, OnInit } from '@angular/core';
import { PeopleService } from '../../services/people.service';

@Component({
  selector: 'app-list-people',
  templateUrl: './list-people.component.html',
  styleUrls: ['./list-people.component.css']
})
export class ListPeopleComponent implements OnInit {

  pessoas = [
    {
      firstName: 'Anderson',
      lastName: 'Queiroz',
      age: '20',
    },
  ];

  constructor(private peopleService:PeopleService) { }
  
  ngOnInit(): void {
    this.getPeaple()
  }

  getPeaple(){
    this.peopleService.getPeople().subscribe((people: any) => {
      this.pessoas = people;
    })
  }
}
