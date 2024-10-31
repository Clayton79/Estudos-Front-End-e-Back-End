const somarNumeros = function(numeros) {
    let soma = 0;
    numeros.forEach(numero => soma += numero);
    return console.log(soma);
}  

somarNumeros([10,10,10]);
somarNumeros([15,15,15,15]);