def revStr(strs):
    strings = strs.split()
    strings = [x[::-1] for x in strings]
    print(" ".join(strings))

revStr("hello how are you")