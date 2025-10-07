const readLine = require('readLine')

let configuracion = {
    input: process.stdin, // entrada estandar teclado
    output: process.stdout  // salida estandar monitor
}

const rl = readLine.createInterface(configuracion)

// programacion sincrona y asincrona
function trabajarConElNumero(num) {
    console.log('el numero que has escrito es: ' + num)
    rl.close()
}

rl.question('dame un numero', trabajarConElNumero)