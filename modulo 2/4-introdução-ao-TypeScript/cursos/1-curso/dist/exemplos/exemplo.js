"use strict";
console.log("estou vinculado ao index.html");
let button = document.getElementById('button');
let input1 = document.getElementById('input1');
let input2 = document.getElementById('input2');
let restosta = document.getElementById('resposta');
function adicionarNumeros(num1, num2, devePrintar, frase) {
    if (devePrintar) {
        let resultado = num1 + num2;
        console.log(frase + resultado);
    }
    return num1 + num2;
}
let devePrintar = true;
let frase = 'o valor é: ';
if (button) {
    button.addEventListener('click', () => {
        if (input1 && input2) {
            console.log(adicionarNumeros(Number(input1.value), Number(input2.value), devePrintar, frase));
        }
    });
}
