const pessoa = {
    nome: 'Mariana',
    idade: 28,
    profissao: 'desenvolvedora',
};

pessoa.idade = 25;

interface PessoaAndre{
    nome: string; 
    idade: number; 
    profissao: string;
};

const andre: PessoaAndre = {
    nome: 'André',
    idade: 25,
    profissao: "pintor",
};

console.log(andre);

// ----------------------------------

enum profissao{
    professora,
    atriz,
    desenvolvedora,
    pintor,
};

interface Pessoa{
    nome: string, 
    idade: number,
    profissao?: profissao //a interrogação faz o atributo profissão não ser obrigatório
};

interface Estudante extends Pessoa{
    materias: string[],
};

// ----------------------------------

const vanessa: Pessoa ={
    nome: 'vanessa',
    idade: 21,
    profissao: profissao.desenvolvedora
};

const Maria: Pessoa ={
    nome: 'vanessa',
    idade: 21,
    profissao: profissao.desenvolvedora
};


const jessica: Estudante = {
    nome: 'Jéssica',
    idade: 28,
    profissao: profissao.desenvolvedora,
    materias: ['Matemática discreta', 'programação' ],
    
};

const monica: Estudante = {
    nome: 'monica',
    idade: 28,
    materias: ['Matemática discreta', 'programação' ],
    
};

function listar(lista: string[]){
    for(const item of lista){
        console.log('- ', item);
    };
};

listar(monica.materias);