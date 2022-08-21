import { UpperCasePipe } from '@angular/common';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes-exemple',
  templateUrl: './pipes-exemple.component.html',
  styleUrls: ['./pipes-exemple.component.css']
})
export class PipesExempleComponent implements OnInit {
  number = 0;
  text = 'Hello world!';
  date = new Date;
  pessoa = {
    nome: 'Arnaldo',
    idade: 20,
    profissao: 'Programmer'
  };

  nomes = ['kuro' , 'kisuke'];

  constructor(private upperCasePipe: UpperCasePipe) { }

  ngOnInit(): void {
    this.text = this.upperCasePipe.transform(this.text);
  }

  mudaValor(){
    this.text = 'novotexto';
  }

  add(text:string) {
    this.nomes.push(text);
  }

  del(text:string) {
    this.nomes.pop();
  }
}