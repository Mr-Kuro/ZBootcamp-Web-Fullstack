function getAdmin(map) {
    let admins = []
    for([key, value] of map) {
        if(value == 'Admin') {
            admins.push(key);
        }
    }

    return admins;
}

const usuarios = new Map();
usuarios.

usuarios.set('Luiz', 'Admin');
usuarios.set('Stephany', 'Admin');
usuarios.set('Jorge', 'Admin');
usuarios.set('Natalia', 'User');

console.log(getAdmin(usuarios));