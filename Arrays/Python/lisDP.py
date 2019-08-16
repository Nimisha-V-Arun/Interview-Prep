"""
        We solve this problem using Dynamic programming
        We use the concept of overlapping here:
            that is we need to find the values of some of the values multiple times

        Procedure:

        Step1 : initialize lis[] to 1 (indicates the longest subsequense is of length 1)
        Step2 : we need to for loops for this:
                for i in range(1,n):
                    for j in range(0,i):
                        to check the no of elements that have a value that is lesser than the 
                        element that is pointing at the location i 
                        refer the code:
        Step3: Select the maximun no from the list
"""
def longestIncrSubSeq(arr):

    n= len(arr)

    lis = [1] * n

    for i in range(1,n):
        for j in range(0,i):
            if(arr[i]>arr[j] and lis[i] < lis[j]+1):
                lis[i] = lis[j]+1## this is necessary to make sure that the length is at lis[j] is always greater than lis[i] given that the first cond is true


    return max(lis)

print(longestIncrSubSeq([10 , 22 , 9 , 33 , 21 , 50 , 41 , 70,60]))


