import { Component, OnInit } from '@angular/core';

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
      nome: 'Kurosaki',
      sobrenome:'Sadao'
    },
    {
      nome: 'Zaraki',
      sobrenome:'Jyouichirou'
    },
    {
      nome: 'Shiro',
      sobrenome:'Hideo'
    }
  ];

  constructor(){

  };

  ngOnInit(): void {
    console.log(this.pessoas);
    let interval = setInterval(():void => {
      this.count ++;
      if(this.count === 10){
        clearInterval(interval);
      } 
    }, 1000);
  }
  

  public clicou(nome:string): void{
      console.log('clicou em mim', nome)
    }

}
