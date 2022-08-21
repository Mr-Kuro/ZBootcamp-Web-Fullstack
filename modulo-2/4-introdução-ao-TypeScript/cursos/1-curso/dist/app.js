"use strict";
console.log("estou vinculado ao index.html");
let buttonteste = document.getElementById('button');
/*
function somarImplicite(parametro1, parametro2){
    return parametro1 + parametro2;
}
*/
function p() {
    console.log('funcionou');
}
buttonteste === null || buttonteste === void 0 ? void 0 : buttonteste.addEventListener('click', p);
/*
console.log("estou vinculado ao index.html");

let buttonteste = document.getElementById('button');

function p(){
    console.log('funcionou')
}

buttonteste?.addEventListener('click', () => {
    console.log('funcionou')
});
*/ 
