# a = 10 , a adalah variabel dengan nilai 10

# Tipe data : Angka Satuan yang gak ada koma nya(Integer)
data_integer = 1
print("data : ", data_integer)
print("- bertipe : ", type(data_integer))

#Tipe data : angka dengan koma (Float)
data_float = 1.5
print("data : ", data_float)
print("- bertipe : ", type(data_float))

#Tipe data : Kumpulan Karakter (String)
data_String = 'Agung'
print("data : ", data_String)
print("- bertipe : ", type(data_String))

#Tipe data : Biner true/false (boolean)
data_bool = True
print("data : ", data_bool)
print("- bertipe : ", type(data_bool))

##Tipe data Khusus

#Tipe data kompleks
data_complex = complex(5,6)
print("data : ", data_complex)
print("- bertipe : ", type(data_complex))

#tipe data dari bahasa C

from ctypes import c_double

data_c_double = c_double (10.5)
print("data : ", data_c_double)
print("- bertipe : ", type(data_c_double))