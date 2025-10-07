// Creacion de clases usando function
function student(name) {
    this.name = name;
    this.notaMedia = () => 9
}

const manolin = new Student ('Manolin')

// Creacion de clases usando class
class Student2 {
    constructor(name) {
        this.name = name
    }

    notaMedia() {
        return 9
    }
}

const pepin = new Student2('Pepin')