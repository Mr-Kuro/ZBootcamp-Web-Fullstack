import { Injectable } from '@angular/core';
import { Observable, of } from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class PeopleService {

  constructor() { }

  getPeople():Observable<any>{
    let peopleArray = [
      {
        firstName: 'Kurosaki',
        lastName: 'Sadao',
        age: '21',
      },
      {
        firstName: 'Zaraki',
        lastName: 'Jyouichirou',
        age: '20',
      },
      {
        firstName: 'Shiro',
        lastName: 'Hideo',
        age: '32',
      },
      {
        firstName: 'Mugen',
        lastName: 'Kuro',
        age: '28',
      },
    ]
    
    return of(peopleArray);
  }
}
