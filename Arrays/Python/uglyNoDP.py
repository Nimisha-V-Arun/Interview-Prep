def uglyDP(n):
    
    """
    Finiding solution to ugly no using Dynamic Pograming

    Steps:
    1) Init Params
        ugly[0] = 1
        i2 = i3 = i5 = 0
        next_multiple_of2 = ugly[0]*2
        next_multiple_of3 = ugly[0]*3
        next_multiple_of5 = ugly[0]*5
    2) Loop i from 1 to n:
        ugly[i] = min(next_multiple_of2,next_multiple_of3,next_multiple_of5)
        if(ugly[i] == next_multiple_of2):
            i2 += 1
            next_multiple_of2 = ugly[i2] * 2
        if(ugly[i] == next_multiple_of3):
            i3 += 1
            next_multiple_of3 = ugly[i3] * 3
        if(ugly[i] == next_multiple_of5):
            i5 += 1
            next_multiple_of5 = ugly[i5] * 5

        
    3) return ugly[-1]       
    """


    ugly = [0] * n

    ugly[0] = 1
    i2 = i3 = i5 = 0

    for i in range(1,n):
        # initialize the ugly[i] to min of next multiple of 2,3,5
        ugly[i] = min(next_multiple_of2,next_multiple_of3,next_multiple_of5)

        # if( the min used to calculate found then ugly[imin] - current ugly * min)
        if(ugly[i] == next_multiple_of2):
            i2 = i2+1
            ugly[i2] = ugly[i] * 2

        if(ugly[i] == next_multiple_of3):
            i3 = i3+1
            ugly[i3] = ugly[i] * 3
        
        if(ugly[i] == next_multiple_of5):
            i3 = i5+1
            ugly[i5] = ugly[i] * 5
        
    return ugly[-1]

print(uglyDP(150))