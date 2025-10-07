/* Crea un programa en JS que:
- Reciba un array con numeros que pueden estar repetidos
- Use un objeto Set para eliminar los duplicados y mostrar solo los valores unicos
- Comprueba si un numero concreto esta en el conjunto (Set)
- Elimina un numero del conjunto (Set)
- Recorre el conjunto e imprima todos sus elementos en consola
- Convierte el conjunto de nuevo en un array y lo muestre en consola, separando sus
elementos con comas.
*/

let arr = [1,2,3,4,5,6,7,8,9,10]

let setNumbers = new Set()
for (let i = 0; i < arr.length; i++) {
    setNumbers.add(arr[i])
}

console.log(setNumbers.has(5)) // true
setNumbers.delete(2) // 2 es el elemento a eliminar, no el indice

setNumbers.forEach(function (value){ // mejor con lambdas
    console.log(value)
}) 

let nuevoArray = []
setNumbers.forEach(function (value) {
    
})