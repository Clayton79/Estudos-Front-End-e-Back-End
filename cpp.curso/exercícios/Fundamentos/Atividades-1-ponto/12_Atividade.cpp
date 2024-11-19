#include <iostream>
using namespace std;

int main() {
    int matriz[4][4], transposta[4][4];

    cout << "Digite os elementos da matriz 4x4:" << endl;
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            cin >> matriz[i][j];
            transposta[j][i] = matriz[i][j];
        }
    }

    cout << "Matriz transposta:" << endl;
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            cout << transposta[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}
