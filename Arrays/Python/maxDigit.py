#code

T = int(input())
i =0 
while(i < T):
    
    no = int(input())
    
    string = str(no)
    string = list(string)
    string.sort(reverse = True)
    i += 1
    no = int("".join(string))
    print(no)

