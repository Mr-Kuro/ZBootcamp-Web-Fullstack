/*
class ContaBancaria {
    constructor(agencia, numero, saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = 'Conta Bancaria';
        this._saldo = saldo;
    };

    getterSaldo() {
        return this._saldo;
    };

    setterSaldo(adicionar) {
        this._saldo = this._saldo + saldo
    };

    sacar(saque){
        this._saldo -= saque;
    }

    depositar(deposito){
        this._saldo += deposito;
    }
};


class ContaCorrente extends ContaBancaria {
    constructor(cartaoCredito){
        super('Conta Corrente');
        this._cartaoCredito = cartaoCredito;
    }   

    getterCartaoCredito() {
        return this._cartaoCredito
    }

    setterCartaoCredito(numeroCartao) {
        this._cartaoCredito = numeroCartao;
    };
    
};


class ContaPolpanca extends ContaBancaria {
    constructor(){
        super('polpança');
    };
};

class ContaUniversitaria extends ContaBancaria {
    constructor(){
        super('Conta Universitária');
    };
    sacar(saque) {
        super.sacar()
        if (saque < 500, this._saldo -= this._saldo) return this._saldo;
        return this._saldo; 
    };
};

let cb = new ContaBancaria(11, 132131, 5465);

let cbc = new ContaCorrente(1254615464, 11, 132131, 00);

let cbp = new ContaPolpanca(11, 132131, 00);

let cbu = new ContaUniversitaria(11, 132131, 00);

console.log(cb.getterSaldo());
console.log(cbc.getterSaldo());
console.log(cbp.getterSaldo());
console.log(cbu.getterSaldo());
console.log(cbu.getterSaldo());

console.log(cbc.tipo) */



class ContaBancaria {
    constructor(agencia, numero, tipo){
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = 'Conta Bancaria';
        this._saldo = 0;
    };

    get saldo() {
        return this._saldo;
    };

    set saldo(adicionar) {
        this._saldo = saldo
    };

    sacar(saque){
        if(saque > this._saldo){
            return 'operação negada!'
        }

        this._saldo -= saque;

        // this.saldo();
    };

    depositar(deposito){
        this._saldo += deposito;

        // this.saldo();
        
    };
};


class ContaCorrente extends ContaBancaria {
    constructor(agencia, numero, cartaoCredito){
        super(agencia, numero);
        this.tipo = 'Conta Corrente'
        this._cartaoCredito = cartaoCredito;
    }   

    get CartaoCredito() {
        return this._cartaoCredito;
    };

    set CartaoCredito(numeroCartao) {
        this._cartaoCredito = numeroCartao;
    };
    
};


class ContaPolpanca extends ContaBancaria {
    constructor(agencia, numero){
        super(agencia, numero);
        this.tipo = 'Poupança'
    };
};

class ContaUniversitaria extends ContaBancaria {
    constructor(agencia, numero){
        super(agencia, numero);
        this.tipo = 'Universitaria'
    };
    sacar(saque) {
        if(saque > 500) {
            return "Operração negada!";
        };

        this._saldo -= saque;
        
        /* if (saque < 500, this._saldo -= this._saldo) return this._saldo;
        return this._saldo; */ 
    };
};