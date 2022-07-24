const myMap = new Map()
/* uma coleção de arrays no formato chave e valor
pode ser iteirado por um loo for...of*/

// métodos:
myMap.set('apple', 'fruit') //'apple' = chave, 'fruit' = valor

myMap.get('apple')

myMap.delete(apple)

myMap.get('apple') // return: undefined pq já foi excluído


// map vs object:
/*
 - map podem ter chaves de qualquer tipo, objetcs só poder ter strings como chaves;
 - map possuem a propriedade legth;
 - maps são mais fáceis de iteirar;
 - utilizado quando o valor das chaves é desconhecido;
 - os valores tem o mesmo tipo. 
*/