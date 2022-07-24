//executa uma função e retorna um valor único

// sintáxi
const array = []
array.reduce(callback, initialValue) 
//callback: função a ser executada a partir do acumulador
// initialvalue: valor sobre o qual o retorno final irá atuar

// Exemplo
const callBack = function(acumulador, currentValue, index, array) {
    // do something
}