// importer arquivos

    // named exports
        import {funcao, variavel, classes} from './arquivo.js';

    // default exports
        import valorDefault from './arquivo.js';

    // trocando nome de imports
        import {arquivo as apelido} from './arquivo.js';
        apelido.metodo();

    // importando todos os dados de um arquivo
        import * as APELIDO from './arquivo.js';

        apelido.metodoA();

        console.log(apelido.variavel)

    // Vinculando ao html
        // <script type="module" src="./arquivo.js"></script>
            // é necessário usar o type module para usar modulação, e é preciso utilizar um servidor
