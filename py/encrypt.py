def encrypt(val,key):
    smallalpha = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
    bigalpha = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
    retval = ''
    for chr in val:
        if chr.isupper(): 
            chr_index = bigalpha.index(chr) 
            retval = retval+bigalpha[(chr_index + key) % 26]
        else: 
            chr_index = smallalpha.index(chr)
            retval = retval+smallalpha[(chr_index + key) % 26]
    return retval;         
