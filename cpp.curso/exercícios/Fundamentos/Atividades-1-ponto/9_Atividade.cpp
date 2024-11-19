#include <iostream>
using namespace std;

int main() {
    int matriz1[2][4], matriz2[2][4], produto[2][4];

    cout << "Digite os elementos da primeira matriz 2x4:" << endl;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 4; j++) {
            cin >> matriz1[i][j];
        }
    }

    cout << "Digite os elementos da segunda matriz 2x4:" << endl;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 4; j++) {
            cin >> matriz2[i][j];
            produto[i][j] = matriz1[i][j] * matriz2[i][j];
        }
    }

    cout << "Matriz produto:" << endl;
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 4; j++) {
            cout << produto[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}