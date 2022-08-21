"use strict";
function somaValores(input1, input2) {
    if (typeof input1 === 'string' || typeof input2 === 'string') {
        return input1.toString() + input2.toString(); //.tostring tranforma algo em string
    }
    else {
        return input1 + input2;
    }
}
console.log(somaValores(1, '8'));
// ----------------------------------------------
function somaValoresNumericos(num1, num2) {
    return num1 + num2;
}
console.log(somaValoresNumericos(55, 6));
function printaValores(num1, num2) {
    console.log(num1 + num2);
}
// -----------------------------------------------------
function sumNumberValues(num1, num2, callback) {
    let result = num1 + num2;
    if (callback) {
        return callback(result);
    }
    else {
        return result;
    }
}
function toSquare(num) {
    return num * num;
}
function selfDivision(num) {
    return num / num;
}
console.log(sumNumberValues(1, 3, toSquare));
console.log(sumNumberValues(1, 3, selfDivision));
console.log(sumNumberValues(1, 3));
