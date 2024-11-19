#include <iostream>
using namespace std;

int main() {
    int matriz[3][4];
    int multiplosDe5 = 0;

    cout << "Digite os elementos da matriz 3x4:" << endl;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            cin >> matriz[i][j];
            if (matriz[i][j] % 5 == 0) {
                multiplosDe5++;
            }
        }
    }

    cout << "Quantidade de números múltiplos de 5: " << multiplosDe5 << endl;
    return 0;
}