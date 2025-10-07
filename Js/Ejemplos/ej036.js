class Cuadrado {
    constructor(lado) {
        this.lado = lado;
    }
    getArea() {return this.lado * this.lado}
}

class Rectangulo extends Cuadrado {
    constructor(l1, l2) {
        super(l1)
        this.lado2 = l2;
    }

    get area() {
        return this.b*this.a/2
    }
    set area(elArea) {
        this.b=2*elArea/this.a
        this.a=2*elArea/this.b
    }
}

let miRect = new Rectangulo(2,5);
miRect.area = 5;
console.log(miRect.area)
