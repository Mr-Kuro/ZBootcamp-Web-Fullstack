"use strict";
let anyEstaDEVolta;
anyEstaDEVolta = 3;
anyEstaDEVolta = 'olá';
anyEstaDEVolta = 5;
let stringTeste = 'verificar';
stringTeste = anyEstaDEVolta;
let unknownValor;
unknownValor = 3;
unknownValor = 'olá';
unknownValor = true;
unknownValor = 'vai sim';
let stringTeste2 = 'agora vai';
// stringTeste2 = unknownValor //
if (typeof unknownValor === 'string') {
    stringTeste2 = unknownValor;
}
function jogaErro(erro, codigo) {
    throw { erro: erro, code: codigo };
}
jogaErro('deu erro', 500);
