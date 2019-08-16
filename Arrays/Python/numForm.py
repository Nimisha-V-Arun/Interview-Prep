def factorial(no):
    f = 1

    if(no == 0 or no == 1):
        return 1

    else:
        return(no*factorial(no-1))

def getSum(n):
    arr = [4,5,6]
    fact = factorial(n)

    digSum = 0
    for i in range(len(arr)):
        digSum += arr[i]
    
    digSum = digSum * (fact // n)

    i =1
    k =1 
    res = 0

    while(i<=n):
        res += digSum * k
        k = k * 10
        i = i+1
    print(res)
    return res


def numForm(arr):
    total =0

    for i in range(1,len(arr)+1):
        
        total += getSum(i)

    print(total)

numForm([4,5,6])