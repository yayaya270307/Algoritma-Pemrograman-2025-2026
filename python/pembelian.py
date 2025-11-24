barang = input("Masukkan nama barang : ")
harga = float(input("Masukkan harga barang : "))
jumlah = int(input("Masukkan jumlah barang : "))

total = harga * jumlah 

if total > 19200:
    diskon = total * 0.2
else:
    diskon = 0

total_pembayaran = total - diskon

print("\n========== STRUK PEMBELIAN ===========")
print(f"Nama Barang : {barang}")
print(f"Harga Satuan : {harga}")
print(f"Jumlah beli : {jumlah}")
print(f"Total Harga : {total}")
print(f"Diskon {diskon}")
print(f"Total Pembayaran {total_pembayaran}")
print("\n======================================")


