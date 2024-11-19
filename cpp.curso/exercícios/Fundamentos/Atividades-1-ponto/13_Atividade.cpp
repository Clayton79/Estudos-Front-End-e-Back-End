#include <iostream>
using namespace std;

int main() {
    int matriz[3][2];
    int imparesNasLinhasPares = 0;

    cout << "Digite os elementos da matriz 3x2:" << endl;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 2; j++) {
            cin >> matriz[i][j];
            if (i % 2 == 0 && matriz[i][j] % 2 != 0) {
                imparesNasLinhasPares++;
            }
        }
    }

    cout << "Quantidade de elementos ímpares nas linhas pares: " << imparesNasLinhasPares << endl;
    return 0;
}