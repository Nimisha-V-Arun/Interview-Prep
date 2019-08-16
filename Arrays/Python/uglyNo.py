def maxDiv(no,div):
    while(no % div == 0):
        no = no / div
    return no


def UglyNo(no):

    no = maxDiv(no,2)
    no = maxDiv(no,3)
    no = maxDiv(no,5)
    if( no == 1):
        return 1
    else:
        return 0


def countNthUN(n):
    
    count = 1
    i = 1

    while( count < n):
        i += 1
        count = count+UglyNo(i)


    print(i)

countNthUN(150)
