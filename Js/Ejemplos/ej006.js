// Un compañero ha diseñado esta funcion para agregar un punto
// y coma al final de una cadena.
// ¿Qué está pasando?
// Los textos, numeros, booleanos en js se pasan por valor, no por referencia

function addSemicolonAtTheEnd(str) {
    str += ' ; ';
}

let msg = "Hola";
addSemicolonAtTheEnd(msg);
console.log(msg);

// Arreglo

function addSemicolonAtTheEnd(str) {
    str + ' ; ';
}

let msg2 = "Hola";
addSemicolonAtTheEnd(msg2);
console.log(msg2);