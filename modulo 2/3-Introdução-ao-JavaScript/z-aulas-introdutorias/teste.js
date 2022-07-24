// Variáveis
/*
var firstName = 'João'
var lastName = 'Souza'

if (firstName === 'João') {
    var firstName = 'pedro'
    let lastName = "Silva"
    console.log(firstName, lastName)
}

console.log(firstName, lastName) 
*/

// constantes
/*
const FIRST_NAME = 'Malia';
 console.log(FIRST_NAME);
 */


 //estrura de dados 
// strings
/*
let nome = 'João';

let sobrenome = 'pedro';

let exemplo = new String('blablabla');

let concatenado = nome.concat(sobrenome)

concatenado = nome + " " + sobrenome;

// 

console.log(typeof nome, nome.concat(sobrenome),typeof concatenado, concatenado.length, typeof exemplo, nome[0], nome.length, "  ", concatenado);

concatenado = nome + ", é do " + sobrenome; 

console.log(concatenado);

concatenado = `${nome}, é do ${sobrenome}`;

console.log(concatenado);

concatenado = '\''
console.log(concatenado);

let frase;
frase = 'olá, tudo bem?';

console.log(frase.split(''));

console.log(frase.split(' '));

console.log(frase.includes('tudo'));

console.log(frase.startsWith("o"));

console.log(frase.endsWith("o"));

console.log(frase.replace(",", "!"));
*/


//Números
/*
let num = 100;
let restoDivisao = num%3;

console.log(Math.PI);

let fiveByTre = 5/3;

console.log(`${Math.floor(fiveByTre)} e ${Math.ceil(fiveByTre)}`);

let percent = 10;
console.log(percent.toString());
*/


// Boneanos
/*
let validation  = 3 === 0

let validation2 = 3 === 3

console.log(validation, validation2.toString(), !validation.toString());
*/


// Array
/*
let array = [1]
let newArray = Array(3)
console.log(`${array} e ${newArray}`)
array.pop()

array.push(3)
console.log(array)
array.push(2)
console.log(array)

array.pop()

array.push(2)
array.push(5)
array.shift()
array.unshift(0)

console.log(array.includes(1))

array.every(item => item === 5 )
array.some(item => item === 5 )

array.reverse()
*/

// Objeto
/*
let obj = {};
 obj.name = 'Julia';
 obj.age = 20;

console.log(Object.values(obj), Object.keys(obj))

let pessoa = {
    name: "Júlia",
    age: 20,
    addres: 'rua2'
}
console.log(`${Object.values(pessoa)} -- ${pessoa.name}`)


pessoa.name = 'Malia'
console.log(pessoa['name'])
console.log(pessoa['name'] = "Miguel")
console.log(pessoa.name)

let mom = 'nameOfMom'

pessoa[mom] = "Tarcisa"

console.log(`${pessoa[mom]} -- ${pessoa.nameOfMom} -- ${pessoa['nameOfMom']} --- ${Object.values(pessoa)} --- ${Object.keys(pessoa)}`)
*/


