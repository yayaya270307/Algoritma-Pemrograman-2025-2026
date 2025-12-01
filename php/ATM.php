<?php

do {
    $nama = readline("Masukkan Nama : ");
    $konfirmasi = readline("Apakah nama anda sudah benar? (Y/N) ");

} while ($konfirmasi == 'N' || $konfirmasi == 'n');

$nim = readline("Masukkan NIM : ");
$saldo = (int)$nim;

echo "Saldo awal anda : Rp $saldo\n";

do {
    echo "\n========== MENU ATM ==========\n";
    echo "1. Cek Saldo\n";
    echo "2. Tarik Tunai\n";
    echo "3. Setor Tunai\n";
    echo "4. Transfer\n";
    echo "5. Keluar\n";
    $menu = readline("menu ");

    switch ($menu) {

        case 1:
            echo "Saldo anda : Rp $saldo\n";
            break;

        case 2:
            $jumlah = readline("Jumlah saldo yang ingin ditarik : ");
            if ($jumlah > $saldo) {
                echo "Saldo tidak cukup!\n";
            } else {
                $saldo -= $jumlah;
                echo "berhasil. Saldo sekarang : Rp $saldo\n";
            }
            break;

        case 3:
            $jumlah = readline("Jumlah setor tunai : ");
            $saldo += $jumlah;
            echo "berhasil. Saldo sekarang : Rp $saldo\n";
            break;

        case 4:
            $bank = readline("Bank tujuan : ");
            $norek = readline("No Rekening : ");
            $jumlah = readline("Jumlah saldo yang akan ditransfer : ");
            if ($jumlah > $saldo) {
                echo "Saldo tidak cukup\n";
            } else {
                $saldo -= $jumlah;
                echo "berhasil. Saldo sekarang : Rp $saldo\n";
            }
            break;

        case 5:
            echo "Terima kasih\n";
            break;

        default:
            echo "Menu tidak valid\n";
    }

} while ($menu != 5);

?>
