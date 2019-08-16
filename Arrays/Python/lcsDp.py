#   Longest Common Subsequce

def lcs(X,Y):

    m = len(X)
    n = len(Y)

    l = [[None]*(n+1) for i in range(m+1)]
    for i in range(m+1):
        for j in range(n+1):
            ## initaially fill all l[o][x] and l[x][0] with 0 for all x in range(n+1) and range(m+1) respectively
            if(i== 0 or j == 0):
                l[i][j] = 0
            elif( X[i-1] == Y[j-1]):
                ## if the corresponding char match then increment
                l[i][j] = l[i-1][j-1] + 1
            else:
                ## else copy the max of the prev value that is to the left or up of l[i][j]
                l[i][j] = max(l[i-1][j],l[i][j-1])
    
    return l[m][n]

print(lcs("hello","hell"))