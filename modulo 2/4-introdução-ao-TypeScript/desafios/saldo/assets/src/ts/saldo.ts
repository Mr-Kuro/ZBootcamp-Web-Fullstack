// O código abaixo tem alguns erros e não funciona como deveria. Você pode identificar quais são e corrigi-los em um arquivo TS?
let botaoAtualizar = document.getElementById('atualizar-saldo') as HTMLButtonElement;
let botaoLimpar = document.getElementById('limpar-saldo') as HTMLButtonElement;
let soma = document.getElementById('soma') as HTMLInputElement;
let campoSaldo = document.getElementById('campo-saldo') as HTMLSpanElement;

campoSaldo.innerHTML = '0'

let total: number; 

//funções 
function somarAoSaldo(soma: number):void {
    total += soma
    campoSaldo.innerHTML = String(total);
}

function limparSaldo(): void {
    total = 0
    campoSaldo.innerHTML = String(total);
}

// btn
botaoAtualizar?.addEventListener('click', function () {
    return somarAoSaldo(Number(soma.value));
});

botaoLimpar.addEventListener('click', function () {
    return limparSaldo();
});

/**
    <h4>Valor a ser adicionado: <input id="soma"> </h4>
    <button id="atualizar-saldo">Atualizar saldo</button>
    <button id="limpar-saldo">Limpar seu saldo</button>
    <h1>"Seu saldo é: " <span id="campo-saldo"></span></h1>*/