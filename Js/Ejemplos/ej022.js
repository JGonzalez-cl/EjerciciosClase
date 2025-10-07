// pasalo a lambda y usa la template string

function fullName(name, surname) {
    return name + " " + surname;
}

const fullName = (name, surname) => `$(name) $(surname)`;

function calculator(a, b, operation) {
    if (operation === "suma") return a + b;
    if (operation === "resta") return a - b;
    return 0;
}

const calculator2 = (a, b, operation) => {
    if (operation === "suma") return a + b;
    if (operation === "resta") return a - b;
    return 0;
}

const operations = {
    suma: (a,b) => a + b,
    resta: (a,b) => a - b,
    division: (a,b) => b!=0 ? a/b : 'Error'
}

const calculator3 = (a, b, operation) => operations[operation] ? operations[operation](a,b) : 'Error'

console.log(calculator3(3, 5, 'suma'))

function greets() {
    return 'Hola!'
}

const greets2 = () => 'Hola!'

function printGreets() {
    console.log('Hola!')
}

const printGreets2 = () => console.log+('Hola!')
printGreets2()

function personCreator(name, age) {
    return {
        name: name,
        age: age,
        gender: 'male',
        state: 'single'
    }
}

const personCreator2 = (name, age) => ({
    name: name,
    age: age,
    gender: 'male',
    state: 'single'
})

