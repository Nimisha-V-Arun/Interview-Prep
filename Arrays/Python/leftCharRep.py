def repeatChar(str):

    charArr = [-1 for x in range(256)]

    res = 999
    for x in range(len(str)):
        if charArr[ord(str[x])] == -1:
            charArr[ord(str[x])] = x
        else:
            res = min(res,charArr[ord(str[x])])

    if res == 999:
        return -1
    else:
        return res 

inp = input()
index = repeatChar(inp)
if (index == -1): 
    print("Either all characters are distinct or string is empty") 
else:   
    print("First Repeating character is",inp[index]) 
