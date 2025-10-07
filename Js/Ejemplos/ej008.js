// crea una clase llamada Semaforo (usa funciones)
// añade los atributos que necesites
// añade los metodos: cambiar y mostrarEstado
// cambiar pasará al siguiente color
// mostrarEstado mostrará el color actual

// verde --> amarillo --> rojo --> verde...

function TrafficLight() {
    let color = 'verde'
    this.color = 'verde'

    this.showState = function() {
        console.log("El semaforo se encuentra en " + this.color)
    }

    this.nextState = function() {
        if(this.color == 'verde'){
            this.color = 'amarillo'
        }
        else if(this.color == 'amarillo'){
            this.color = 'rojo'
        }
        else if(this.color == 'rojo'){
            this.color = 'verde'
        }
    }
}

let semaforo1 = new TrafficLight()

TrafficLight.showState()
TrafficLight.nextState()
TrafficLight.showState()