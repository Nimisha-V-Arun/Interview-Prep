def countLetter(string):

    count = list()
    cnt = 1
    for x in range(len(string)):
        # if you reach the last char of the string or if the adj char are different
        if(x+1 == len(string) or string[x] != string[x+1]):
            count.append(string[x])
            count.append(str(cnt))
            cnt = 1
        elif string[x] == string[x+1]:
        # if adj char are the same
            cnt += 1
        

    print("".join(string),"".join(count))
countLetter(list("aaabccb"))