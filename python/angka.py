a = int(input("Masukkan angka pertama : "))
b = int(input("Masukkan angka kedua : "))

if a > b:
    print(a, "lebih besar dari", b)
elif a < b:
    print(a, "lebih kecil dari", b)
else:
    print("Keduanya sama besar")

print("Apakah keduanya sama?", a==b)