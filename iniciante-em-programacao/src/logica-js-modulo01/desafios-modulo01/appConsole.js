alert('Boas vindas ao jogo do número secreto');

let numeroSecreto = 9;
console.log(numeroSecreto);

let chute = prompt('Escolha um numero entre 1 e 10');

if (chute == numeroSecreto) {
    alert(`Isso aí! Você descobriu o número secreto ${numeroSecreto}`); //a crase transforma o texto em TEMPLATE STRINGS
} else {
    alert('Você errou :(');
}