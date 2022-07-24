function filtraPares(arr) {
    return arr.filter(callback);
}

function callback(item) {
    if(item % 2 !== 0) return false;
    return true;
}

const meuArray = [1, 23, 55, 67, 30, 2, 4];

console.log(filtraPares(meuArray));


// outro exemplo
let array = [1, 2, 3, 4];

array.filter((item) => item % 2 === 0); // [´2, 4]