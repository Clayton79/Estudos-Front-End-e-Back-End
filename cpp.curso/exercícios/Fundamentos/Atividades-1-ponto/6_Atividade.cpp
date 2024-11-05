#include <iostream>
using namespace std;

int main() {
    
    int limite, contadorPares = 0, contadorImpares = 0;

    cout << "--- Contar Números Pares e Ímpares ---" << endl;
    cout << "Digite um limite: ";
    cin >> limite;

    
    for (int i = 1; i <= limite; i++) {
        if (i % 2 == 0) {
            contadorPares++;
        } else {
            contadorImpares++;
        }
    }

    cout << "Quantidade de números pares: " << contadorPares << endl;
    cout << "Quantidade de números ímpares: " << contadorImpares << endl;

    
    int regressiva;

    cout << "\n--- Contagem Regressiva ---" << endl;
    cout << "Qual o valor para início da contagem regressiva? ";
    cin >> regressiva;

    
    cout << "Contagem regressiva usando while:" << endl;
    while (regressiva >= 0) {
        cout << regressiva << endl;
        regressiva--;
    }

    
    cout << "\nQual o valor para início da contagem regressiva? ";
    cin >> regressiva;

    
    cout << "Contagem regressiva usando do...while:" << endl;
    do {
        cout << regressiva << endl;
        regressiva--;
    } while (regressiva >= 0);

    return 0;
}