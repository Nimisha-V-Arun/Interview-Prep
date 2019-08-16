class dutchNationalFlag():
    
    def __init__(self,pat,str):
        self.charArr = list(str)
        self.pat = list(pat) 

    def threeWayPartition(self):

        p = 0
        q = len(self.charArr)-1
        i = p
        while(i <= q):
            if(self.charArr[i] == self.pat[0] ):
                temp = self.charArr[p]
                self.charArr[p] = self.charArr[i]
                self.charArr[i] = temp
                p += 1
                i += 1
            elif(self.charArr[i] == self.pat[2]):
                temp = self.charArr[q]
                self.charArr[q] = self.charArr[i]
                self.charArr[i] = temp
                q -=1
            else:
                i +=1
        
        

                
a = dutchNationalFlag("hol","holloo")
a.threeWayPartition()
print("".join(a.charArr))

a = dutchNationalFlag("rgb","rgbrgbrgbrgb")
a.threeWayPartition()
print(str.join(a.charArr))
