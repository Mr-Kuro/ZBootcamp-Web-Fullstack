function verificaPalindromo(string) {
    if (!string) throw new TypeError('String Inválida')

    if(string === string.split('').reverse().join('')) return `A string: "${string}", é um palíndromo!`;

    return `A string: "${string}", Não é um palíndromo!`;
}

function tryCatchExemplo(string) {
    try {
        return verificaPalindromo(string)
    } catch (error) {
        return error
    } finally {
        console.log(`A string enviada foi: ${string}. \n`)
    }
}

console.log(tryCatchExemplo('omo'))


/*
let str = 'jango'
console.log(str.split(''))
console.log(str.split('').reverse())
console.log(str.split('').reverse().join(''))

console.log(str.split(''))

console.log(str.join(''))
console.log(str.reverse(''))
*/