
function criptografar() {
    var entradaTexto = document.getElementById("entradaTexto").value;
    var saidaTexto = document.getElementById("saidaTexto");
    var saidaOrientacoes = document.getElementById("saidaOrientacoes");
    var saidaResultado = document.getElementById("saidaResultado");

    var criptografado = entradaTexto.replace(/[aeiou]/g, function(substituir) {
        switch(substituir) {
            case "a": return "ai";
            case "e": return "enter";
            case "i": return "imes";
            case "o": return "ober";
            case "u": return "ufat";
        }
    });
    saidaTexto.innerText = criptografado;
    saidaOrientacoes.style.display = "none";
    saidaResultado.style.display= "block";
}

function descriptografar() {
    var entradaTexto = document.getElementById("entradaTexto").value;
    var saidaTexto = document.getElementById("saidaTexto");
    var saidaOrientacoes = document.getElementById("saidaOrientacoes");
    var saidaResultado = document.getElementById("saidaResultado");

    var descriptografado = entradaTexto.replace(/ai|enter|imes|ober|ufat/g, function(substituir) {
        switch(substituir) {
            case "ai": return "a";
            case "enter": return "e";
            case "imes": return "i";
            case "ober": return "o";
            case "ufat": return "u";
        }
    });
    saidaTexto.innerText = descriptografado;
    saidaOrientacoes.style.display = "none";
    saidaResultado.style.display = "block";
}

function copiar() {
    var saidaTexto = document.getElementById("saidaTexto").innerText;
    navigator.clipboard.writeText(saidaTexto).then(function() {
        alert("Texto copiado para a área de transferência!");
    }, function(err) {
        alert("Erro ao copiar o texto: " + err);
    });
}

function limpar() {
    location.reload();
}
