def editDist(str1,str2):

    m = len(str1)
    n = len(str2)
    # Create a table to store results of subproblems 

    d = [[0 for i in range(n+1)]for j in range(m+1)]

    for i in range(m+1):
        for j in range(n+1):

            # If first string is empty, only option is to 
            # insert all characters of second string

            if( i == 0 ):
                d[i][j] = j
            # If second string is empty, only option is to 
            # remove all characters of second string 
      
            elif( j == 0 ):
                d[i][j] = i
            
             
            # If last characters are same, ignore last char 
            # and recur for remaining string 
   
            
            elif(str1[i-1] == str2[j-1]):
                d[i][j] = d[i-1][j-1]

            # If last character are different, consider all 
            # possibilities and find minimum 
            else:
                d[i][j] = 1 + min(d[i][j-1],        # Insert 
                                   d[i-1][j],        # Remove 
                                   d[i-1][j-1])    # Replace
            

    return d[m][n]

print(editDist("sunday","sundoy"))