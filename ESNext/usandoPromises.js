// com promise

const http = require("http");

const getTurma = letra => {
    const url = `http://files.cod3r.com.br/curso-js/turma${letra}.json`;
    return new Promise((resolve, reject) => {
        http.get(url, res => {
            let resultado = "";

            res.on("data", dados => {
                resultado += dados;
            });

            res.on("end", () => {
                try {
                    // Garante que a resposta seja JSON válida
                    const json = JSON.parse(resultado);
                    resolve(json);
                } catch (e) {
                    reject(new Error(`Erro ao processar os dados da turma ${letra}: ${e.message}`));
                }
            });
        }).on("error", reject);
    });
};

Promise.all([getTurma("A"), getTurma("B"), getTurma("C")])
    .then(turmas => [].concat(...turmas))
    .then(alunos => alunos.map(aluno => aluno.nome))
    .then(nomes => console.log(nomes))
    .catch(e => console.log(e.message));

getTurma("D").catch(e => console.log(e.message));