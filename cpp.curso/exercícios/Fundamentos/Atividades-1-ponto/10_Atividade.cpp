#include <iostream>
using namespace std;

int main() {
    float matriz[4][4];
    int linha;

    cout << "Digite os elementos da matriz 4x4:" << endl;
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            cin >> matriz[i][j];
        }
    }

    cout << "Digite a linha que deseja visualizar (0 a 3): ";
    cin >> linha;

    if (linha >= 0 && linha < 4) {
        cout << "Linha " << linha << ": ";
        for (int j = 0; j < 4; j++) {
            cout << matriz[linha][j] << " ";
        }
        cout << endl;
    } else {
        cout << "Linha inválida!" << endl;
    }

    return 0;
}