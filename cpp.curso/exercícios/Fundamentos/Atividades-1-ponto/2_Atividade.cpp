#include <iostream>
using namespace std;

int main() {
    float lado1, lado2, lado3;

    
    cout << "Informe a medida do primeiro lado do triângulo: ";
    cin >> lado1;
    cout << "Informe a medida do segundo lado do triângulo: ";
    cin >> lado2;
    cout << "Informe a medida do terceiro lado do triângulo: ";
    cin >> lado3;

    
    if (lado1 == lado2 && lado2 == lado3) {
        cout << "O triângulo é Equilátero." << endl;
    }
    else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        cout << "O triângulo é Isósceles." << endl;
    }
    else {
        cout << "O triângulo é Escaleno." << endl;
    }

    return 0;
}