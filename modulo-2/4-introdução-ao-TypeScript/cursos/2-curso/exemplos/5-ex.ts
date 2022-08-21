/*

interface IUsuario {
    id: string;
    email: string;
}

interface IAdmin extends IUsuario{
    cargo: 'gerente' | 'coordenador' | 'supervisor';
};

function redirecione(usuario: IUsuario | IAdmin){
    if('cargo' in usuario) { //in ajuda a verificar se o parametro possui tal dado
        
        // redirecionar para a área de administração
    }

    // redirecionar para área do usuário
}

*/


/*
interface IUsuario {
    id: string;
    email: string;
    cargo?: 'funcionario' | 'gerente' | 'coordenador' | 'supervisor';
}


function redirecione(usuario: IUsuario){
    if(usuario.cargo) {
        // redirecionar(usuario.cargo);
    }
    // redirecionar para a área do usuário
}

*/