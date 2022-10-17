form_input = ["input user:", "input password:"]
my_login = ["rizki", "123456"]
my_input = []

for i in range(len(form_input)):
    my_input.append(input(form_input[i]))
    if (my_input[0] == my_login[0] and my_input[1] == my_login[1]):
        print("User dan Password kamu Valid")

    else:
        print("User dan Password Tidak Valid")

print("Gabungan array user dan password menggunakan append menjadi seperti ini : ", my_input)

