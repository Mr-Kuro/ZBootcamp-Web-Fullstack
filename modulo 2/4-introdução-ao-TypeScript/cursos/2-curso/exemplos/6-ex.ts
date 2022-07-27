interface Cachorro {
    nome: string;
    idade: number;
    parqueFavorito?: string
}

type CachorroSomenteLeitura = {
    +readonly [K in keyof Cachorro]: Cachorro[K] // o '-?' remove o opcional
}

/*const meuCachorro: cachorro = {
    nome: 'apolo',
    idade: 14,
}*/

class meuCachorro implements CachorroSomenteLeitura {
    nome;
    idade;

    constructor(nome, idade) {
        this.nome = nome;
        this.idade = idade
    }
}

const cao =  new meuCachorro('Apollo', 14);

console.log(cao.nome, cao.idade)
cao.idade = 8;
console.log(cao.nome, cao.idade)
