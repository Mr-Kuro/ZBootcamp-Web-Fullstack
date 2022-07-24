console.log("Substitor de numeros pares")
function confereArray(array){
    if (!array) return -1;
    return array
}

function transformNumPares(num){
    if (num % 2 === 0) return 0
    return num
}

// console.log(transformNumPares(6))

const index = (
    function substituirNumPares(array){
        array = confereArray(array)

        if (array !== -1){
            var numTransform = [];

            for (let i = 0; i < array.length ; i++) {
                numTransform.push(transformNumPares(array[i]))  
            }

            return numTransform
        }

        return array
    }
)([2,3,1,5,8]);


/* testes e xemplos
var array = [];
console.log(arrayf.push(1))
console.log(!arrayf);

[ 2, 3, 1, 5, 8 ] // antes
[ 0, 3, 1, 5, 0 ] // depois

[] //antes
-1 //depois

*/

console.log(index)
console.log(this)
 