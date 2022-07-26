"use strict";
const pessoa = {
    nome: 'Mariana',
    idade: 28,
    profissao: 'desenvolvedora',
};
pessoa.idade = 25;
;
const andre = {
    nome: 'André',
    idade: 25,
    profissao: "pintor",
};
console.log(andre);
// ----------------------------------
var profissao;
(function (profissao) {
    profissao[profissao["professora"] = 0] = "professora";
    profissao[profissao["atriz"] = 1] = "atriz";
    profissao[profissao["desenvolvedora"] = 2] = "desenvolvedora";
    profissao[profissao["pintor"] = 3] = "pintor";
})(profissao || (profissao = {}));
;
;
;
// ----------------------------------
const vanessa = {
    nome: 'vanessa',
    idade: 21,
    profissao: profissao.desenvolvedora
};
const Maria = {
    nome: 'vanessa',
    idade: 21,
    profissao: profissao.desenvolvedora
};
const jessica = {
    nome: 'Jéssica',
    idade: 28,
    profissao: profissao.desenvolvedora,
    materias: ['Matemática discreta', 'programação'],
};
const monica = {
    nome: 'monica',
    idade: 28,
    materias: ['Matemática discreta', 'programação'],
};
function listar(lista) {
    for (const item of lista) {
        console.log('- ', item);
    }
    ;
}
;
listar(monica.materias);
