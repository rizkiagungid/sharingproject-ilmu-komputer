list = []


def Sorting(jumlah):
    print('Aplikasi Sorting')
    print('------------------')
    print('1.Selection Sort')
    print('2.Bubble Sort')
    print('3.Merge Sort')
    print('4.Insertion Sort')
    print('5.Credit Title')


    choice = input("Pilih Menu (1-5) : ")

    if choice == '1':
        SelectionSort(jumlah)
    elif choice == '2':
        BubbleSort(jumlah)
    elif choice == '3':
        MergeSort(jumlah)
    elif choice == '4':
        InsertionSort(jumlah)
    elif choice == '5':
        CreditTittle(jumlah)


def SelectionSort(A):
    print('[1] Selection Sort')
    print('-----------------------')
    for i in range(len(A) - 1, 0, -1):
        Max = 0
        for I in range(1, i + 1):
            if A[I] > A[Max]:
                Max = I
        temp = A[i]
        A[i] = A[Max]
        A[Max] = temp
    print('Data yang sudah terurut : ', list)


def BubbleSort(A):
    print('[2] Bubble Sort')
    print('-----------------------')
    tukar = True
    while tukar:
        tukar = False
        for j in range(len(A) - 1):
            if A[j] > A[j + 1]:
                A[j], A[j + 1] = A[j + 1], A[j]
                tukar = True
    print('Data yang sudah terurut : ', list)


def MergeSort(A):
    print('[3] Merge Sort')
    print('-----------------------')
    # print('Bilangan diurutkan ',A)
    Input();
    def Input():
        jumlah = int(input('\nInput Banyak Data : '))
        awal = 0
        while (awal < jumlah):
            awal = awal + 1
            bil = input('Data ke - %d ' % awal)
            list.append(bil)
        print("Data yang anda input : ", list)
    if len(A) > 1:
        mid = len(A) // 2
        lefthalf = A[:mid]
        righthalf = A[mid:]
        MergeSort(lefthalf)
        MergeSort(righthalf)
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


def InsertionSort(A):
    print('[4] Insertion Sort')
    print('-----------------------')
    Input()
    for index in range(1, len(A)):
        a = A[index]
        b = index
        while b > 0 and A[b - 1] > a:
            A[b] = A[b - 1]
            b = b - 1
            A[b] = a
    print('Data yang sudah terurut : ', list)


def CreditTittle(jumlah):
    print("[5] Credit Title")
    print("---------------------")
    print("1. 15200064 - Leonardus Alex Sandi Sugiarto Simbolon")
    print("2. Muhammad Kahfi Prayoga")
    print("3. Pramudya Widyastama")
    print("4. Rizki Agung Sentosa")
    print("5. Rayhan Aqsyal Athallah")
    print("6. Fachry Fadillah")


Sorting(list)