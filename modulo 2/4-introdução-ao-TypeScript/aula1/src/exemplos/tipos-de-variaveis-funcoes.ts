type input = number | string;


function somaValores(input1:input, input2:input){
    if(typeof input1 ==='string' || typeof input2 === 'string'){
       return input1.toString() + input2.toString(); //.tostring tranforma algo em string
    } else{
        return input1 + input2;
    }
}

console.log(somaValores(1,'8'));


// ----------------------------------------------

function somaValoresNumericos(num1: number, num2: number): number{
    return num1 + num2;
}

console.log(somaValoresNumericos(55, 6))

function printaValores(num1: number, num2: number):void // esta função não irá retornar nada!
{
    console.log(num1 + num2);
}
 
// -----------------------------------------------------

function sumNumberValues(num1: number, num2: number, callback?: (num1: number) => number): number{
    let result = num1 + num2;
    if(callback){
        return callback(result);
    } else{
        return result;
    }

}

function toSquare(num: number): number{
    return num * num;
}

function selfDivision(num: number): number{
    return num / num;
}

console.log(sumNumberValues(1,3, toSquare))
console.log(sumNumberValues(1,3, selfDivision))
console.log(sumNumberValues(1,3))