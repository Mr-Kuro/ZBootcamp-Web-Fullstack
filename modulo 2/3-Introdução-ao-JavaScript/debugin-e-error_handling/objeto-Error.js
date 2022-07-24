// new Error(messege, fillNMame, lineNumber)

// todos os parâmetros são opcionais

const MeuErro = new Error('Mensagem Inválida');

MeuErro.name = 'invalidMessege';
MeuErro.stack


throw MeuErro;
