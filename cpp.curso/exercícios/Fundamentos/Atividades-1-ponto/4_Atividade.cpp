#include <iostream>
using namespace std;

int main() {
    int codigo;
    int quantidade;
    float preco = 0.0;

    
    cout << "*** Cardápio ***" << endl;
    cout << "100 – Hambúrguer – R$5,50" << endl;
    cout << "101 – Cachorro-quente – R$4,50" << endl;
    cout << "102 – Milk-shake – R$7,00" << endl;
    cout << "103 – Pizza brotinho – R$8,00" << endl;
    cout << "104 – Cheeseburguer – R$8,50" << endl;
    
    
    cout << "Informe o código do seu pedido: ";
    cin >> codigo;

    
    switch (codigo) {
        case 100:
            preco = 5.50;
            break;
        case 101:
            preco = 4.50;
            break;
        case 102:
            preco = 7.00;
            break;
        case 103:
            preco = 8.00;
            break;
        case 104:
            preco = 8.50;
            break;
        default:
            cout << "Código de pedido inválido." << endl;
            return 1; 
    }

    
    cout << "Informe a quantidade: ";
    cin >> quantidade;

    
    float valorTotal = preco * quantidade;

    
    cout << "Você pediu " << quantidade << " item(s) de código " << codigo << "." << endl;
    cout << "Valor total a pagar: R$" << valorTotal << endl;

    return 0;
}