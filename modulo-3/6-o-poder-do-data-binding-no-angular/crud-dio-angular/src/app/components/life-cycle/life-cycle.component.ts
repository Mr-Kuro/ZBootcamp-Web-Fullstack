import { AfterContentChecked, AfterContentInit, AfterViewChecked, Component, DoCheck, Input, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-life-cycle',
  templateUrl: './life-cycle.component.html',
  styleUrls: ['./life-cycle.component.css']
})
export class LifeCycleComponent implements OnInit, OnChanges, DoCheck, AfterContentInit, AfterContentChecked, AfterViewChecked, OnDestroy {
  @Input() number = 10;

  constructor() { 
    console.log('Chamou o construtor')
  }

  ngOnChanges(): void {
    console.log('Chamou OnChanges')
    
  }

  ngOnInit(): void {
    console.log('Chamou o OnInit')

  }

  ngDoCheck(): void {
    console.log('Chamou DoCheck')
    
  }

  ngAfterContentInit(): void {
    console.log('Chamou o AfterContentInit')
    
  }

  ngAfterContentChecked(): void {
    console.log('Chamou AfterContentChecked')
    
  }

  

  ngAfterViewinit(): void {
    console.log('Chamou ngAfterViewinit')
    
  }

  ngAfterViewChecked(): void {
    console.log('Chamou o ngAfterViewChecked')
    
  }

  

  ngOnDestroy(): void {
    console.log('Chamou o OnDestroy')
    
  }



}
