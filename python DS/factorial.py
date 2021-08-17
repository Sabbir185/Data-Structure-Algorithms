def factorial(num):
    assert num >= 0 and int(num) == num, 'Only positive integer accept'
    if num in [0,1]:
        return 1
    else:
        return num*factorial(num-1)

print(factorial(4))