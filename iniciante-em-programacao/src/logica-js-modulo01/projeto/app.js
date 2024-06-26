alert('Boas vindas ao jogo do número secreto');

let numeroMaximo = 5000;
let numeroSecreto = parseInt(Math.random() * numeroMaximo + 1);
console.log(numeroSecreto);
let chute;
let tentativas = 1;

//enquanto chute não for igual ao número secreto, faça
while (chute != numeroSecreto) {
    chute = prompt(`Escolha um numero entre 1 e ${numeroMaximo}`);

    //se chute for igual ao número secreto, faça...
    if (chute == numeroSecreto) {
        break;
       
        // se não, faça...
    } else {
        if (numeroSecreto > chute) {
            alert(`O número secreto é maior que ${chute}`);
        } else {
            alert(`O número secreto é menor que ${chute}`);
        }
        tentativas++ //tentativas = tentativas + 1;
    }
}
//USANDO OPERADOR TERNÁRIO
let palavraTentativa = tentativas > 1? 'tentativas' : 'tentativa';
alert(`Isso aí! Você descobriu o número secreto ${numeroSecreto} com ${tentativas} ${palavraTentativa}.`)

/* USANDO IF
if (tentativas > 1) {
    alert(`Isso aí! Você descobriu o número secreto ${numeroSecreto} com ${tentativas} tentativas`); //a crase transforma o texto em TEMPLATE STRINGS
} else {
    alert(`Isso aí! Você descobriu o número secreto ${numeroSecreto} com ${tentativas} tentativa`); 
}*/
