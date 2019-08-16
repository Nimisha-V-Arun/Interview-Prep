word1 = input("Entert the word: ")
word2 = input("Entert the word: ")

word1 = list(word1)
word1.sort()
print(word1)

word2 = list(word2)
word2.sort()
print(word2)

if(len(word1) != len(word2)):
    print("Not an anagram")

word1 = ''.join(word1)
word2 = ''.join(word2)
print(word1)
print(word2)
for i in range(len(word1)):
    if(word1[i] != word2[i]):
        break
    if(i == len(word1)-1):
        print("Its an Anagram")
