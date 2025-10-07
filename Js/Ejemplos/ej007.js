// se quiere que la funcion opere 2 numeros y realice una operacion con ellos.
// paso de funciones a funciones

function operarNumeros(a, b, operacion) {
    return operacion(a,b)
}

function sumar(a, b) {
    return a + b
}

function multiplicar(a, b) {
    return a * b
}

console.log(operarNumeros(2, 3, sumar) )
console.log(operarNumeros(2, 3, multiplicar) )