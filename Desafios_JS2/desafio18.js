const despesasTotais = function(arr) {
    const getPreco = price => price.preco;
    const soma = (total, atual) => total + atual;
    const total = arr.map(getPreco).reduce(soma);
    return console.log(total);
}

despesasTotais([
    {nome: "Jornal online", categoria: "informação", preco: 89.99},
    {nome: "Cinema", categoria: "Entretenimento", preco: 150}
    
]);
despesasTotais([
    {nome: "Galaxy S20", categoria: "Eletrônicos", preco: 3599.99},
    {nome: "Macbook Pro", categoria: "Eletrônicos", preco: 30999.90}
]);