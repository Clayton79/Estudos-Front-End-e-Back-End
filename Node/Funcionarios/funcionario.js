const url = "http://files.cod3r.com.br/curso-js/funcionarios.json";
const axios = require("axios");

axios.get(url).then(response => {
const funcionarios = response.data;
const menorSalarioChinesF = funcionarios.map(function(e) {
    return e.salario;
}).reduce(function(acumulador, atual) {
    let oi = acumulador < atual ? acumulador : atual;
    return oi;
    // if(acumulador < atual) {
    //     return acumulador
    // } else {
    //     return atual
    // }
    // console.log(acumulador, atual);
    // return acumulador + atual 
});
    console.log(menorSalarioChinesF);
});



// fiz só peguei o salario menor de tudo, só falta pegar a mulher e que seja chinesa ela.