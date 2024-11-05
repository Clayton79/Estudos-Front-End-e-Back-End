#include <iostream>
using namespace std;

int main() {
    int idade;
    int NUM_COMPETIDORES = 5; 

    for (int i = 0; i < NUM_COMPETIDORES; i++) {
        cout << "Informe a idade do competidor " << (i + 1) << ": ";
        cin >> idade;

        if (idade >= 7 && idade <= 12) {
            cout << "Categoria: INFANTIL" << endl;
        }
        else if (idade >= 13 && idade <= 17) {
            cout << "Categoria: JUVENIL" << endl;
        }
        else if (idade >= 18 && idade <= 49) {
            cout << "Categoria: ADULTO" << endl;
        }
        else if (idade >= 50) {
            cout << "Categoria: SENIOR" << endl;
        }
        else {
            cout << "Idade fora da faixa de categorias disponíveis." << endl;
        }
    }

    cout << "Todas as idades foram processadas." << endl;

    return 0;
}
