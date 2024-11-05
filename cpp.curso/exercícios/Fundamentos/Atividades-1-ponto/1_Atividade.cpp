#include <iostream>
using namespace std;

int main() {
    int numMes;
    bool invalido = false;

    cout << "Informe o número do mês: ";
    cin >> numMes;

    switch (numMes) {
        case 1:
            cout << "O número " << numMes << " equivale ao mês de janeiro" << endl;
            break;
        case 2:
            cout << "O número " << numMes << " equivale ao mês de fevereiro" << endl;
            break;
        case 3:
            cout << "O número " << numMes << " equivale ao mês de março" << endl;
            break;
        case 4:
            cout << "O número " << numMes << " equivale ao mês de abril" << endl;
            break;
        case 5:
            cout << "O número " << numMes << " equivale ao mês de maio" << endl;
            break;
        case 6:
            cout << "O número " << numMes << " equivale ao mês de junho" << endl;
            break;
        case 7:
            cout << "O número " << numMes << " equivale ao mês de julho" << endl;
            break;
        case 8:
            cout << "O número " << numMes << " equivale ao mês de agosto" << endl;
            break;
        case 9:
            cout << "O número " << numMes << " equivale ao mês de setembro" << endl;
            break;
        case 10:
            cout << "O número " << numMes << " equivale ao mês de outubro" << endl;
            break;
        case 11:
            cout << "O número " << numMes << " equivale ao mês de novembro" << endl;
            break;
        case 12:
            cout << "O número " << numMes << " equivale ao mês de dezembro" << endl;
            break;
        default:
            cout << "Mês inválido!!!" << endl;
            invalido = true;
            break;
    }

    if (!invalido && numMes >= 1 && numMes <= 12) {
        
    }

    return 0;
}