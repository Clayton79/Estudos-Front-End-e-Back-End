#include <iostream>
using namespace std;

int main() {
    
    int numero, contadorMultiplosDeTres = 0;

    cout << "--- Contar múltiplos de 3 ---" << endl;
    cout << "Digite 10 números inteiros:" << endl;
    for (int i = 0; i < 10; i++) {
        cout << "Número " << (i + 1) << ": ";
        cin >> numero;

        
        if (numero % 3 == 0) {
            contadorMultiplosDeTres++;
        }
    }
    cout << "Quantidade de múltiplos de 3: " << contadorMultiplosDeTres << endl;

    
    double numeroReal, maiorNumero;

    cout << "\n--- Encontrar o maior número entre 15 números reais ---" << endl;
    cout << "Digite 15 números reais:" << endl;
    for (int i = 0; i < 15; i++) {
        cout << "Número " << (i + 1) << ": ";
        cin >> numeroReal;

        
        if (i == 0 || numeroReal > maiorNumero) {
            maiorNumero = numeroReal;
        }
    }
    cout << "O maior número informado é: " << maiorNumero << endl;

    
    int regressiva;

    cout << "\n--- Contagem regressiva ---" << endl;
    cout << "Qual o valor para início da contagem regressiva? ";
    cin >> regressiva;

    
    cout << "Contagem regressiva:" << endl;
    for (int contador = regressiva; contador >= 0; contador--) {
        cout << contador << endl;
    }

    return 0;
}