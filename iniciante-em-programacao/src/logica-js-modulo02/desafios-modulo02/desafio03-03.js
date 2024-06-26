let cotacaoDolar = 4.8;
function converterEmReais(valorEmDolar) {
    let valorEmReais = valorEmDolar*cotacaoDolar;
    return valorEmReais.toFixed(2); //fixa 2 casas decimais após a vírgula
}

console.log(converterEmReais(10));