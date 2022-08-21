import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'printList',
  pure: false
})
export class PrintListPipe implements PipeTransform {

  transform(value: string[], ...args: unknown[]): unknown {
    let returnString = '';
    if(value.length){
      value.forEach(vaL => {
        returnString += ' ' + vaL;
      })
    }
    return returnString;
    
  }

}
