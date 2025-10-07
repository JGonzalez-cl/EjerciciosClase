// Funciones de orden superior

// map
const numbers = [2,5,8]
const newNumbers = numbers.map((x)=>x*2)
console.log(newNumbers)

// filter: devuelve un array con los elementos que cumplan la funcion
numbers = [2,8,3]
const odd = numbers.filter((x)=>x%2 !==0)
console.log(odd)

// reduce: aplica una funcion a un acumulador y a cada valor del array
numbers = [3,4,7,2]
const sumas = numbers.reduce((acumulator, x)=> acumulator + x)
console.log(sumas)

// forEach: hace algo por cada elemento
numbers = [5,7,8]
numbers.forEach((x)=> console.log('numero: ' + x))
numbers.forEach((x, index)=> console.log('numero ' + index + ':' + x))

// find: devuelve el primero¡ elemento que cumple la funcion
numbers = [4,8,101,7,200]
const elemento = numbers.find((x)=> x > 100)
console.log(elemento)

// some: verifica si al menos algun elemento del array cumple la funcionalidad
numbers = [4,8,100,33]
const cumple = numbers.some((x)=> x >20)
comsole.log(cumple)

// every: verifica si todos los elementos del array cumplen la funcion
numbers = [4,8,100,33]
const cumplenTodos = numbers.every((x)=> x > 20)
console.log(cumplenTodos) // false

// sort: (machaca) ordena el array por el criterio establecido en la funcion
numbers = [4,2,8]
numbers.sort()
console.log(numbers) // 2, 4, 8

numbers.sort((a,b)=>b-a)
console.log(numbers) // 8, 4, 2

// concat
numbers = [3,6]
const otherNumbers = [6,7]
const concatenation = numbers.concat(otherNumbers)
console.log(concatenation)
console.log({...numbers, ...otherNumbers})

// slice: nos quedamos con una porcion del array original
numbers = [5,7,3,8,2]
const subArray = numbers.slice(1,3)
console.log(subArray)

// splice: (machaca) cambia el contenido de un array (eliminando o reemplazando)
numbers = [1,2,3,4,5]
numbers.splice(1,3)
console.log(numbers) // 1, 5

numbers = [1,2,3,4,5]
numbers.splice(1,3, 'a', 'b')
console.log(numbers) // 1, a, b, 5

// flat: genera un nuevo array aplanando el original
numbers = [(2,5,6),(3,4,[5,8])]
const plano = numbers.flat(2)
console.log(plano)

// reverse: (machaca) da vuelta
numbers = [1,2,3]
numbers.reverse()
console.log(numbers)[3,2,1]

// includes: verifica si el array tiene un elemento determinado
numbers = [4,7,3,10,7]
const saco10 = numbers.includes(10)
console.log(saco10)

// indexOf: (empieza por la izquierda) devuelve el primer indice en el que se encuentra el elemento dado
numbers = [4,10,7,3,10,7]
const index = numbers.indexOf(10)
console.log(index) // 1

// indexOf: (empieza por la izquierda) devuelve el primer indice en el que se encuentra el elemento dado
numbers = [4,10,7,3,10,7]
const index2 = numbers.lastIndexOf(10)
console.log(index2) // 4

// join: une los elementos del array con la cadena que especifiques
numbers = [3,6,7]
const cadena = numbers.join('::')
console.log(cadena) // 3::6::7

// key, values, entries
numbers = [3,6,7]
for (let [indice, valor] of numbers.entries()) {
    console.log(indice, '-', valor) // 0 - 3    1 - 6   2 - 7
}

// flatMap: es un map que aplana (flat) el resultado
