const meuElemento = document.getElementById('meu-elemento');

meuElemento.classList.add("novo-estilo");
// adiciona a classe meu estilo

meuElemento.classList.remove("classe");
// remove a classe "classe"

meuElemento.classList.toggle("dark-mode");
// adiciona a classe "dark-mode caso ela não faça parte da lista e remove ela caso o faça."


// acessando um css do JS
document.querySelector(".meu-paragrafo").style.color = "#31FF4E";
// document.getElementsByTagName('p').style.border = '1px solid blue';