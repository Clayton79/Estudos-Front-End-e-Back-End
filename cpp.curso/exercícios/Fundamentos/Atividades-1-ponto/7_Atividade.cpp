#include <iostream>
using namespace std;

int main() {
    
    int linhas;
    cout << "--- Desenhar Metade de um Triângulo ---" << endl;
    cout << "Quantas linhas deve ter o triângulo? ";
    cin >> linhas;

    for (int i = 1; i <= linhas; i++) {
        for (int j = 1; j <= i; j++) {
            cout << "* ";
        }
        cout << endl;
    }

    
    int numero, fatorial = 1; 

    cout << "\n--- Calcular Fatorial ---" << endl;
    cout << "Digite um número para calcular o fatorial: ";
    cin >> numero;

    if (numero < 0) {
        cout << "Fatorial de um número negativo não existe." << endl;
    } else {
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        cout << "O fatorial de " << numero << " é: " << fatorial << endl;
    }

    
    int termos;
    cout << "\n--- Exibir Série de Fibonacci ---" << endl;
    cout << "Quantos termos da série de Fibonacci você deseja ver? ";
    cin >> termos;

    int primeiro = 0, segundo = 1, proximo;

    cout << "Série de Fibonacci: ";
    for (int i = 0; i < termos; i++) {
        if (i == 0) {
            cout << primeiro;
        } else if (i == 1) {
            cout << ", " << segundo;
        } else {
            proximo = primeiro + segundo;
            cout << ", " << proximo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
    cout << endl;

    return 0;
}