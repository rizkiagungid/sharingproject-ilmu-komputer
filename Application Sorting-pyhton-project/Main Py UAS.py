
# =========================================== APLIKASI SORT ===================================================== #

list = []

def menu_aplikasi(jumlah):
    print("")
    print("=================================== APLIKASI SORT ==========================================")
    print("------- Menu Awal --------")
    print("[1]. Selection Sort")
    print("[2]. Bubble Sort")
    print("[3]. Merge Sort")
    print("[4]. Insertion Sort")
    print("[5]. Credit Title")
    print("[6]. Exit")
    print("==========================")
    menu = input("Pilih Menu [1-6] : ")
    print()

    if menu == "1" :
        print("=============================================================================================")
        print("==================================== Selection Sort =========================================")
        Input()
        option_selection(jumlah)
        lanjut = input("\n""lanjut ke Menu ? [y/n] : ")
        if lanjut == "y" :
            list.clear()
        else :
            exit()

    elif menu == "2" :
        print("=============================================================================================")
        print("===================================== Bubble Sort ===========================================")
        Input()
        option_bubble(jumlah)
        lanjut = input("\n""lanjut ke Menu ? [y/n] : ")
        if lanjut == "y":
            list.clear()
        else:
            exit()

    elif menu == "3" :
        print("=============================================================================================")
        print("====================================== Merge Sort ===========================================")
        Input()
        option_merge(jumlah)
        lanjut = input("\n""lanjut ke Menu ? [y/n] : ")
        if lanjut == "y":
            list.clear()
        else:
            exit()

    elif menu == "4" :
        print("=============================================================================================")
        print("===================================== Insertion Sort ========================================")
        Input()
        option_insertion(jumlah)
        lanjut = input("\n""lanjut ke Menu ? [y/n] : ")
        if lanjut == "y":
            list.clear()
        else:
            exit()

    elif menu == "5" :
        print("=============================================================================================")
        print("====================================== Credit ===============================================")
        credit_title(jumlah)
        lanjut = input("\n""lanjut ke Menu ? [y/n] : ")
        if lanjut == "y":
            list.clear()
        else:
            exit()

    elif menu == "6":
            exit()

    else :
        print("### ERROR 101 ###")
    return menu_aplikasi(jumlah)

def Input():
    jumlah = int(input('\nInput Banyak Data : '))
    y = len(list)
    for x in range(jumlah):
        nilai = int(input("Masukkan Angka : "))
        list.append(nilai)
    print("Data yang anda input : ", list)

#==================================================================================================================
def option_selection(A) :

    for i in range(len(A) - 1, 0, -1):
        Max = 0
        for I in range(1, i + 1):
            if A[I] > A[Max]:
                Max = I
        temp = A[i]
        A[i] = A[Max]
        A[Max] = temp
    print('Data Angka Yang Ber-urut Adalah : ', list)

#==================================================================================================================
def option_bubble(A) :

    tukar = True
    while tukar:
        tukar = False
        for j in range(len(A) - 1):
            if A[j] > A[j + 1]:
                A[j], A[j + 1] = A[j + 1], A[j]
                tukar = True
    print('Data Angka Yang Ber-urut Adalah : ', list)

#==================================================================================================================
def option_merge(A) :

    if len(A) > 1:
        mid = len(A) // 2
        lefthalf = A[:mid]
        righthalf = A[mid:]
        option_merge(lefthalf)
        option_merge(righthalf)
        i = j = k = 0
        while i < len(lefthalf) and j < len(righthalf):
            if lefthalf[i] < righthalf[j]:
                A[k] = lefthalf[i]
                i = i + 1
            else:
                A[k] = righthalf[j]
                j = j + 1
            k = k + 1
        while i < len(lefthalf):
            A[k] = lefthalf[i]
            i = i + 1
            k = k + 1
        while j < len(righthalf):
            A[k] = righthalf[j]
            j = j + 1
            k = k + 1
    print('Merging ', A)
    print('Data yang sudah terurut : ', list)

#==================================================================================================================
def option_insertion(A) :
    for index in range(1, len(A)):
        a = A[index]
        b = index
        while b > 0 and A[b - 1] > a:
            A[b] = A[b - 1]
            b = b - 1
            A[b] = a
    print('Data Angka Yang Ber-urut Adalah : ', list)

#==================================================================================================================
def credit_title(jumlah) :
    print("-- Nama Kelompok --")
    print("1. 15200064 - Leonardus Alex Sandi Sugiarto Simbolon")
    print("2. 15200105 - Muhammad Kahfi Prayoga")
    print("3. 15200088 - Pramudya Widyastama")
    print("4. 15200048 - Rizky Agung Sentosa")
    print("5. 15200041 - Rayhan Aqsyal Athallah")
    print("6. 15200073 - Fachry Fadillah")

#==================================================================================================================

# Tampilan Awal Menu
#menu_aplikasi()
menu_aplikasi(list)