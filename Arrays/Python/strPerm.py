
no = int(input("Enter thr no of strings that you want to input"))


def permutation(string,l,r):
    if(r == l):
        print(''.join(string))
    else:
        for i in range(l,r+1):
            string[l], string[i] = string[i] , string[l]
            print(l,r,string)

            permutation(string,l+1,r)
            string[l], string[i] = string[i] , string[l]
    
    

i =0
while( i != no):    
    string = input("Enter the string")
    n = len(string)
    permutation(list(string),0,n-1)
    i += 1

