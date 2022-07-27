/*
console.log('TypeScript?')

// interfaces
// animal e subcategorias

interface IAnimal {  // cntratos para definir estruturas de dados
    nome: string,
    tipo: 'terrestre' | 'aquático',
    executarRugido ?(alturaDecibeis: number): void,
    domestico: boolean,
};

interface Ifelino extends IAnimal {
    visaoNoturna: boolean;
};

interface Icanino extends IAnimal {
    porte: 'pequeno' | 'medio' | 'grande';
};


// types
type IDomestico = Ifelino | Icanino;

// objetos
const animal:  IDomestico ={
    domestico: true,
    nome: 'cachorro',
    tipo: 'terrestre',
    porte: 'medio',

    
}

const felino: Ifelino = {
    nome: "Lão",
    tipo: 'terrestre',
    visaoNoturna: true,
    executarRugido: (alturaDecibeis) => (`${alturaDecibeis}db`),
    domestico: true,
};
*/