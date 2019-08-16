

def evenLenString(string):

    strs = string.split()

    length = [len(x) for x in strs]

    curLen =0
    maxLen = 0
    maxInd = -1
    for x in range(len(strs)):
        curLen = len(strs[x])
        if(curLen%2 == 0):
            if(curLen>maxLen):
                maxLen = curLen
                maxInd = x

    if(maxInd != -1):
        print(strs[maxInd],len(strs[maxInd]))
    else: 
        print("No max even length found ")


inp = input("Word ?")

evenLenString(inp)