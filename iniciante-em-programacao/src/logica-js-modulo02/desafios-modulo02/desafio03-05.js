function calcularAreaEPerimetroDeSalaCircular(raio) {
    let area = Math.PI * raio * raio;
    let perimetro = 2 * Math.PI * raio;

    console.log(`A área da sala é ${area.toFixed(2)} m² e o perímetro é ${perimetro.toFixed(2)} m.`)
}

calcularAreaEPerimetroDeSalaCircular(3);