function cantidadMinimaCambio(monedas) {

    monedas.sort((a, b) => a - b);

    let cambio_minimo = 0;

    for (let moneda of monedas) {
        if (moneda > cambio_minimo + 1) {
            return cambio_minimo + 1;
        }
        cambio_minimo += moneda;
    }

    return cambio_minimo + 1;
}

// Serie de números
let monedas = [1, 2, 5, 10, 20, 50];

console.log("El cambio mínimo que no se puede crear es:", cantidadMinimaCambio(monedas));
