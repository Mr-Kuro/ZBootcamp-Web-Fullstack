function cauculaIdade(anos) {
    return `Daqui a ${anos} anos, ${this.nome} terá ${this.idade + anos} anos de idade.`;
}

const pessoa1 = {
    nome: 'Maria',
    idade: 30,
}

const pessoa2 = {
    nome: 'Carla',
    idade: 26,
}

const animal = {
    nome: 'Fiona',
    idade: 5,
    raca: 'Bulldog',
}

console.log(cauculaIdade.call(pessoa1, 30))
console.log(cauculaIdade.call(animal, 7))
console.log(cauculaIdade.apply(animal, [7]))
console.log(cauculaIdade.apply(animal, [4]))
