// colecciones
// arrays

let arr = [1, 2, 3, 4, 5]

console.log(arr[0]) // 1
console.log(arr.length) // 5

let array = [2, 7, 1]

// map
function doblar(num) {
    return num * 2
}
function cuadrado(num) {
    return num * num
}
const resultado1 = array.map(doblar) // 4, 14, 2
const resultado2 = array.map(cuadrado) // 16, 49, 1

console.log(resultado1)
console.log(resultado2)

//
arr2 = [2, 7, 1]
function esPar(num) {
    return num % 2 == 0
}
arr2.filter(esPar) // 2

arr2.join('::') // 2::7::1

let newArray = '2, 7, 1'.split(',')

arr2.push(10)
console.log(arr2) // 2, 7, 1, 10

arr2 = [2, 7, 1]
let ultimoElemento = arr2.pop() // 2, 7

arr2 = [2, 7, 1]
arr2.unshift(20) // 20, 2, 7, 1

arr2 = [2, 7, 1]
let primerElemento = arr2.shift() // 7, 1

arr2 = [1, 2, 3, 4]
arr2.splice(1, 2) // 1, 4 elimina 2 elementos a partir de la posicion 1
console.log(arr2)

arr2 = [1, 2, 3, 4]
let nuevosDatos = arr2.slice(1, 3) // 2, 3 devuelve una copia desde la posicion 1 
console.log(nuevosDatos)

// Ejercicio
// Crea un array con:
// los numeros del 1 al 10
// una funcion que reciba un numero y diga si es positivo o negativo
// un objeto que represente un producto(nombre, precio, stock)
// un booleano

let array1 = []

for (let i=1; i<10; i++){
    array1.push(i)
}

array1.push( function (num) {return num >= 0})

array1.push({
    nombre: 'CocaCola',
    precio: 1.5,
    stock: 20
})

array1.push(true)

// usa el array
// muestra el primer elemento del array
console.log(array1[0])
// ejecuta la funcion que hay en el array
array1[10](9) // true
// muestra el nombre del producto
array1[11].nombre
// añade al principio el numero 0
array1.unshift(0)
// añade al final el booleano contrario al que hay
array1.push( !array1[12])
// muestra la longitud del array
console.log(array1.length)
// cuenta cuantos elementos hay de tipo booleano
function isBoolean(elem) { // funcion pura
    return typeof(elem) === 'boolean'
}

console.log(array1.filter(isBoolean).length)