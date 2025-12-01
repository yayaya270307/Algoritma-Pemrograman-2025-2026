#include <iostream>
using namespace std;

int main() {
    string nama, bank; 
    char konfirmasi; 
    int nim, saldo, menu, jumlah, norek;

    do {
        cout << "Masukkan Nama : ";
        cin >> nama;

        cout << "Apakah nama anda sudah benar? (Y/N)  ";
        cin >> konfirmasi;

    } while (konfirmasi == 'N' || konfirmasi == 'n');

    cout << "Masukkan NIM : ";
    cin >> nim;
    saldo = nim;

    cout << "saldo awal anda : Rp " << saldo << endl;

    do {
        cout << "\n========== MWNU ATM ==========\n";
        cout << "1. Cek Saldo\n";
        cout << "2. Tarik Tunai\n";
        cout << "3. Setor Tunai\n";
        cout << "4. Transfer\n";
        cout << "5. Keluar\n";
        cout << "Menu ";
        cin >> menu;

        switch(menu) {

            case 1:
                cout << "Saldo anda : Rp " << saldo << endl;
                break;

            case 2:
                cout << "Jumlah saldo yang ingin ditarik : ";
                cin >> jumlah;

                if (jumlah > saldo) {
                    cout << "Saldo tidak cukup, tidak dapat ditarik\n";
                } else {
                    saldo -= jumlah;
                    cout << "berhasil. Saldo Sekarang : Rp " << saldo << endl;
                }
                break;

            case 3:
                cout << "Jumlah setor tunai : ";
                cin >> jumlah;
                saldo += jumlah;
                cout << "berhasil. Saldo sekarang : Rp " << saldo << endl;
                break;

            case 4: 
                cout << "Bank tujuan: ";
                cin >> bank;

                cout << "No Rekening: ";
                cin >> norek;
                cout << "Jumlah yang akan ditransfer : ";
                cin >> jumlah;

                if (jumlah > saldo) {
                    cout << "Saldo tidak cukup, tidak dapat transfer\n";
                } else {
                    saldo -= jumlah;
                    cout << "berhasil. saldo sekarang : Rp " << saldo << endl;
                }
                break;

            case 5:
                cout << "terimakasih\n";
                break;

            default:
                cout << "Menu tidak valid!\n";
        }

    } while (menu != 5);

    return 0;
}
