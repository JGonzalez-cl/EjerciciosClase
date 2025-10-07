const coffeeMachine = {
    sugarAmount: 5,
    type: 'solo',
    do: function () {
        setTimeout(() => {
            console.log(`Café servido:` + this.type)
        },   3000)
    }
}