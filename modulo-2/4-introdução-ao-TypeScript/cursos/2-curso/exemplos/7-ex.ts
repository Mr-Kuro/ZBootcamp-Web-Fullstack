/*interface Estudante {
    nome: string;
    idade: number
}

interface Estudante {
    serie: string;
}

const estudante: Estudante = {
    nome: 'mario',
    idade: 12,
    serie: '7ºA'
}*/

import $ from 'jquery';
$.fn.extend({
    novaFuncao(){
        console.log('chamou nova função');
    }
})

$('body').novaFuncao();