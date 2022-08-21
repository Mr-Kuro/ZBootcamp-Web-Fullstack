import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';
import { Todo } from 'src/app/models/todo';

@Component({
  selector: 'app-todo-item',
  templateUrl: './todo-item.component.html',
  styleUrls: ['./todo-item.component.css']
})
export class TodoItemComponent implements OnInit {
  @Input() todo: Todo = {
    id: 0,
    title:'',
    done: false
  };

  @Output() remove = new EventEmitter

  done = false;

  constructor() { }

  ngOnInit(): void {
  }

  markAsDone():void{
    debugger;
    this.done = true
    
    console.log(this.todo)
  }

  removeTodo():void{
    this.remove.emit(this.todo  )

    console.log(this.todo)
  }
}
