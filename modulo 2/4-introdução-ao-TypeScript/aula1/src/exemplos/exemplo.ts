console.log("estou vinculado ao index.html");

let button = document.getElementById('button');
let input1 = document.getElementById('input1') as HTMLInputElement;
let input2 = document.getElementById('input2') as HTMLInputElement;
let restosta = document.getElementById('resposta');

function adicionarNumeros(num1:number, num2:number, devePrintar:boolean, frase:string){ //necessário tipar as variáveis! pq? ora, pq é TypeScript! :D
    if(devePrintar){
        let resultado = num1 + num2
        console.log(frase + resultado)
    }
    return num1 + num2
}

let devePrintar = true;
let frase = 'o valor é: '

if (button){
    button.addEventListener('click', () => {
        if(input1 && input2){
            console.log(adicionarNumeros(Number(input1.value), Number(input2.value), devePrintar, frase))
        }
    })
}