#include <iostream>
#include <vector>
using namespace std;

int main() {
    string nim;
    cout << "Masukkan NIM : ";
    cin >> nim;

    vector<int> digit;
    for (char c : nim) {
        digit.push_back(c - '0');
    }

    int total = 0;
    for (int d : digit) {
        total += d;
    }

    int maks = digit[0];
    for (int d : digit) {
        if (d > maks) {
            maks = d;
        }
    }

    int minim = digit[0];
    for (int d : digit) {
        if (d < minim) {
            minim = d;
        }
    }

    double rata = (double) total / digit.size();

    vector<int> rev;
    for (int i = digit.size() - 1; i >= 0; i--) {
        rev.push_back(digit[i]);
    }

    cout << "Digit        : ";
    for (int d : digit) cout << d << " ";
    cout << endl;

    cout << "Total        : " << total << endl;
    cout << "Maksimum     : " << maks << endl;
    cout << "Minimum      : " << minim << endl;
    cout << "Rata-rata    : " << rata << endl;
    cout << endl;

    return 0;
}
