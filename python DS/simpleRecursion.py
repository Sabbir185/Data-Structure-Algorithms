# def showDoll (doll):
#     if doll == 1:
#         print('Doll number 1 is found!')
#     else:
#         showDoll(doll-1)

# showDoll(10);


def rec(n):
    if n<1:
        print("n is less then 1")
    else:
        rec(n-1)
        print(n)

rec(5)