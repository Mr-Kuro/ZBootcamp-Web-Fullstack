function validaArray(array, number) {
    try {
        if(!array & !number) throw new ReferenceError('consira os parãmetros')

        if(typeof array !== 'object') throw new TypeError('parãmetro 1 não é um objeto')

        if(typeof number !== 'number') throw new TypeError('O parãmetro 2 não é um número')

        if(array.length !== number) throw new RangeError('tamanho diferente do especificado')

        return array

    } catch (error) {
        if (error instanceof ReferenceError) {
            console.log("Este é um ReferenceError")
            // console.log(error.name)
            return (error.message)
            // console.log(error.stack)
        } else if (error instanceof TypeError) {
            console.log("Este é um TypeError")
            // console.log(error.name)
            return (error.message)
            // console.log(error.stack)
        } else if (error instanceof RangeError) {
            console.log("Este é um RangeError")
            // console.log(error.name)
            return (error.message)
            // console.log(error.stack)
        }else{
            return ('Tipo de erro não esperado: ' + error)
        }
    }
}

console.log(validaArray([], 0))