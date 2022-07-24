const myArray = [1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 2, 1];

const mySet = new Set(myArray);
//estruturas que armazenam valores únicos: não se pretem nunca

//  métodos:

mySet.add(1);
mySet.add(2);

mySet.has(1); //true
mySet.has(3); //false

console.log(mySet)

mySet.delete(2)

console.log(mySet)

// set - características:
/*
 possui valores únicos;
 em vez de propriedade length, consulta-se o número de registros pela propriedade size;
 não pssui os métodos map, dilter, reduce etc.
*/