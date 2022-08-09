import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  apiUrl = 'https://sheet.best/api/sheets/1f2bcfc3-ff7d-4ca9-8f6e-ffee4f381381';
    
  constructor(private httpClient: HttpClient) { }

  // retorna a lista de usuários READ
  getUsers():Observable<User[]>{
    return this.httpClient.get<User[]>(this.apiUrl)
  }

  //salva usuarios no banco
  postUser(user: User):Observable<User>{
    return this.httpClient.post<User>(this.apiUrl, user);
  }

  // exclui o usuario do banco de dados DELETE
  deleteUser(id:number):Observable<User>{
    return this.httpClient.delete<User>(`${this.apiUrl}/id/${id}`)
  }

  // método que edita usuario UPDATE
  updateUser(id:string, user: User): Observable<User>{
    return this.httpClient.put<User>(`${this.apiUrl}/id/${id}`, user)
  }

  // lista usuário único
  getUser(id: string): Observable<User[]>{
    return this.httpClient.get<User[]>(`${this.apiUrl}/id/${id}`)
  }

}
