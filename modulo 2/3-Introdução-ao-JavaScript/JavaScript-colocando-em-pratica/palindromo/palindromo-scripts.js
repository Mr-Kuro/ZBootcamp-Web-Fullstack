function verificaPalindromo(string) {
    if (!string ) return 'string vazia';


   return string.split("").reverse().join('') === string;
}


/* testes de mesa
omo
012
abba
0123

let a = 'abba';
console.log(a.length)
*/

function verificaPalindromo2(string) {
    if (!string ) return 'string vazia';

    for (let i = 0; i < string.length / 2; i++) {
        if (string[i] !== string[string.length -1 -i]) {
            return false;
        }
    }

    return true
}


console.log(verificaPalindromo2('absa'));

