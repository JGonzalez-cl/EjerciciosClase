// Dada esta clase que modela una cuenta bancaria

function CuentaBancaria(titular, saldoInicial) {
    this.titular = titular
    this.saldo = saldoInicial
    // no se toca
}

// añade en tiempo de ejecucion las siguientes funcionalidades 
// 1. un metodo ingresar(cantidad) que sume la cantidad al saldo
// 2. un metodo extraer(cantidad) que reste la cantidad al saldo
//  si no hay saldo suficiente, no se restará nada
// 3. un metodo informar() que devuelva una cadena con el titular y el saldo actual

CuentaBancaria.prototype.ingresar = function(cantidad) {
    this.saldo += cantidad
}

CuentaBancaria.prototype.extraer = function(cantidad) {
    if (this.saldo >= cantidad) {
        this.saldo -= cantidad
    } else {
        console.log("No hay suficiente dinero")
    }
}

CuentaBancaria.prototype.informar = function() {
    console.log(`Titular: ${this.titular} , saldo: ${this.saldo}`)
}

let miCuenta = new CuentaBancaria('Juan', 1000)
miCuenta.informar()
miCuenta.ingresar(500)
miCuenta.informar()