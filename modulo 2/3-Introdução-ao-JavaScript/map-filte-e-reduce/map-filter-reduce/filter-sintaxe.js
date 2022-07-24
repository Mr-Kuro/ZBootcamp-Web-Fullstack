// ccria novo array
// não modifica o original

const array = []
array.filter(callback, thisArg)
// callback: funcção a ser executada em cada elemento
// thisArg: valor de this dentro da função de callback

// exemplo
const frutas = [
    'maçã fuji', 'maçã verde', 'laranja', 'abacaxi'
];

frutas.filter((fruta) => fruta.includes('maçã')) // retorna: ['maçã fuji', 'maçã verde'];
