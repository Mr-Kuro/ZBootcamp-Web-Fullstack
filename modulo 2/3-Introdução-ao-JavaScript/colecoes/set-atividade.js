
const mArray = [30, 30, 5, 223 ,149 ,3014 ,5]

function setArray(origin) {
    const conjunto = new Set()

    for(i = 0; i < origin.length; i++) {
        conjunto.add(origin[i])
    }

    return [...conjunto]
}

console.log(' ', mArray)


const array = [30, 30, 5, 223, 149, 3014 ,5]

function valoresUnicos(arr) {

    const mySet = new Set(arr);

    return [...mySet];
}

console.log(valoresUnicos(array))