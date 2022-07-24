const array = [1, 2, 3, 4, 5]

array.map(callback, thisArg)
// callback(item, index, array): função ser utilizada em cada elemento

// thisArg(opcional)


// map vs forEach
//  usando map
array.map((item) => item * 2); // retorna: [2, 4, 6, 8, 10] 

//  usando forEach
array.forEach((item) => item *2); // return: undefined

// considere se o array auxiliar será necessário