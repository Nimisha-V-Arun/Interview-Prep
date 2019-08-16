class rainWater():
    
    def __init__(self,arr):
        self.arr = arr

    def waterQuant(self):
        arr = self.arr
        lmax = [max(arr[:x+1]) for x in range(len(arr)) ]
        rmax = [max(arr[x:len(arr)]) for x in range(len(arr))]

        minlr = [min(lmax[x],rmax[x]) for x in range(len(arr))]

        waterStored = [minlr[x]-arr[x] for x in range(len(arr))]

        totalWater = sum(waterStored)

        print(lmax, " lmax")
        print(rmax, " rmax")
        print(minlr, " minlr")
        print(waterStored, " waterStored")

        print(totalWater, " waterCollected")
        
        
p = rainWater([3,0,0,2,0,4])

p.waterQuant()



        
p1 = rainWater([0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1])

p1.waterQuant()