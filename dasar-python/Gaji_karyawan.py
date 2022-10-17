#Disini saya membuat script Gaji karyawan.
#Pertama saya masukin String dulu.

nama = input("Masukan Nama Anda = ")
jabatan = input("Masukan Jabatan Anda = ")

#Lalu ini integer nya.
gaji = int(input("Masukan Gaji Anda = "))

#ini saya buat operator dan perhitungan
pajak = 10 / 100 * gaji



print()
print("Pegawai dengan nama", nama, "dan jabatan", jabatan, "\ndengan gaji", gaji, "harus membayar pajak sebesar", pajak, "dengan cara mentransfer ke Rekening Perusahaan kami di BCA 15200048 PT RIZKI AGUNG JAYA ")