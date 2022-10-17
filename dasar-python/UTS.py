#
print("=======================================")
print("NIM  : 15200048")
print("NAMA : RIZKI AGUNG SENTOSA")
print("=======================================")
#
def Max(daftar):
    maks=0
    for x in daftar:
        if x > maks:
            maks=x
    return maks
def Min(daftar):
    min=999
    for y in daftar:
        if y < min:
            min=y
    return min

jumlahAngka=[]
angka=int(input("Berapa banyak angka yang akan anda input: "))
for n in range(angka):
    nilai=int(input(""))
    jumlahAngka.append(nilai)

print("Angka-angka yang saya input adalah:", jumlahAngka)
print("Angka paling besar yang saya input adalah:", angkaMax(jumlahAngka))
print("Angka paling kecil yang saya input adalah:", angkaMin(jumlahAngka))