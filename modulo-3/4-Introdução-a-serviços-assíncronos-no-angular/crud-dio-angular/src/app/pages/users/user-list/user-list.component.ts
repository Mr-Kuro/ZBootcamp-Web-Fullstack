import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/user';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {
  users: Array<User> = [];

  constructor(private userservice:UserService) { }

  ngOnInit(): void {
    this.getUsers()
  }

  getUsers(): void{
    this.userservice.getUsers().subscribe(response => {
      this.users = response;
      console.log(this.users);
    }, (err) =>{
      console.log('ERRO AO EXECUTAR', err.status)
    })
  }

  deleteUser(id:number):void{
    this.userservice.deleteUser(id).subscribe(response => {
      console.log('usuário excluído');
    }, (err) =>{
      console.log('ERRO AO EXECUTAR', err.status)
    }, ()=>{
      this.getUsers();
    })
  }

}
