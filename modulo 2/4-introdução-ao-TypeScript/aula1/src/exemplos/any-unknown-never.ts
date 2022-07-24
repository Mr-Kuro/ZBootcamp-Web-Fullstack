let anyEstaDEVolta: any;
anyEstaDEVolta = 3;
anyEstaDEVolta = 'olá';
anyEstaDEVolta = 5;

let stringTeste: string = 'verificar'
stringTeste = anyEstaDEVolta;

let unknownValor: unknown;
unknownValor = 3;
unknownValor = 'olá';
unknownValor = true;
unknownValor = 'vai sim';

let stringTeste2: string  = 'agora vai';
// stringTeste2 = unknownValor //

if(typeof unknownValor === 'string'){
    stringTeste2 = unknownValor;
}

function jogaErro(erro: string, codigo: number): never // código que nunca é finalizado
{
    throw {erro: erro, code: codigo};
}

jogaErro('deu erro', 500);