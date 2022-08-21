import { getCurrencySymbol } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Event } from '@angular/router';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {
  text = 'Anderson Queiroz';
  imageUrl = 'https://picsum.photos/100/100?grayscale';
  imageDesc='This is lorempisc image';
  buttonText  ='Clique aqui';
  textRed = false;
  bgColor='cyan';
  fontSize='20px';
  widthImg=60;
  textInput='';
  number = 0;
  destroy = false;

  constructor() { }

  ngOnInit(): void {
  }

  retornaNome(){
    return this.text;
  }

  clicou(){
    this.text='Mr. Kuro'
    console.log(this.text,' clicou aqui');
    this.textRed=true
  }

  dbClick(){ 
    this.textRed=false
    this.text='Anderson Queiroz'
    console.log(this.text,' clicou aqui');
  }

  keypressEnter(event:string){
    console.log(event);
  }

  clicouNoFilho(text: Event){
    console.log(text)
  }

  incrementa(){
    this.number ++;
  }

  destroyComponent(){
    if(!this.destroy){
      this.destroy =true;
    } else{
      this.destroy =false;
    }
    
  }

}
