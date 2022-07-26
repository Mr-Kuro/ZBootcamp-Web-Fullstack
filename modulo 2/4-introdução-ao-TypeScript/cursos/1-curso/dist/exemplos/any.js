"use strict";
let valorAny;
valorAny = 3;
valorAny = 'olá';
valorAny = true;
let valorString = 'teste';
valorString = valorAny;
let valorString2 = 'testão';
valorString2 = valorAny;
function SomaStrings(str1, str2) {
    console.log(str1 + str2);
}
SomaStrings(valorString, valorString2);
SomaStrings('olá ', 'mundo!');
