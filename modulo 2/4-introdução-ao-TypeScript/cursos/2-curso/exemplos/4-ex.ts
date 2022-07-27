// generics types
console.log('generics types');

function adicionaApendiceAlista <NaoSei>(array: any, valor: NaoSei){  // o padrão é T ao nvez de NaoSei
    return array.map(item => item + valor);
}

adicionaApendiceAlista(['T','2','3'], "1")