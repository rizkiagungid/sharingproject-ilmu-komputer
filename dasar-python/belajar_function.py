def sapa(nama) :
    print("Hi," + nama + ", Apa Kabar?")

sapa('Rizki Agung')



def print_string(str) :
    print(str)

print_string(str="hello Rizki Agung")

def print_info(nama, usia):
    print("nama", nama)
    print("usia", usia)
print_info(usia=19, nama="Rizki Agung Sentosa")

def print_info(nama, usia=17):
    print("nama", nama)
    print("usia", usia)
print_info(usia=19, nama="Rizki Agung Sentosa")
print_info(nama= "Cristian Ronaldo")

total = 0

def sum (argn1 , argn2) :
    total = argn1 + argn2;
    print("Di dalam Nilai Total : ", total)
    return total
sum(19,20)
print("diluar fungsi, nilai total : ", total)