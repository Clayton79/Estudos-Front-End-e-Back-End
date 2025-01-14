const url = "http://files.cod3r.com.br/curso-js/funcionarios.json";
const axios = require("axios");

axios.get(url).then((response) => {
  const funcionarios = response.data;

  const menorSalarioChinesF = funcionarios
    .map((funcionario) => {
      if (funcionario.pais === "China" && funcionario.genero === "F") {
        return funcionario.salario;
      } else {
        return Infinity;
      }
    })
    .reduce((menor, salario) => {
      return salario < menor ? salario : menor;
    });

  console.log(menorSalarioChinesF);
});