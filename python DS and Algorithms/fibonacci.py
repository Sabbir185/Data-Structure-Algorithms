# 1 1 2 3 5 8 13

def fibonacci(num):
    assert num >= 0 and int(num) == num , 'Wrong input'
    if num in [0,1]:
        return num
    else:
        return fibonacci(num-1) + fibonacci(num-2)
    
print(fibonacci(7))