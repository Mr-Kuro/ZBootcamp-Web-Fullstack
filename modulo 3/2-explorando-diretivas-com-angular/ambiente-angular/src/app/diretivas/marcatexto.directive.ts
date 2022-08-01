import { Directive, ElementRef, Input, OnInit } from '@angular/core';

@Directive({
  selector: '[appMarcatexto]'
})
export class MarcatextoDirective implements OnInit{
  @Input() corDeFundo: string = 'blue';
  @Input() corDeTexto: string = 'white;'

  constructor(private element: ElementRef) { }

  ngOnInit(): void {
    this.mudarFundo();
  }

  private mudarFundo(cor:string = 'yellow'){
    this.element.nativeElement.style.backgroundColor = this.corDeFundo || cor;
    
    this.element.nativeElement.style.color = this.corDeTexto;

    this.element.nativeElement.style.fontWheight = 'bold';
  }
}
