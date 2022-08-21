function somaNumeros(arr) {
    return arr.reduce(function(prev, current) {
        console.log({prev});
        console.log({current});
        // return prev + current;
        const result = prev + current;
        console.log('soma: ', result);
    }, 1)
}

const arr = [2, 3];

console.log(somaNumeros(arr));