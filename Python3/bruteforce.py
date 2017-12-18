import string 

letters = 'abcdefghijklmnopqrstuvwxyz'

def bruteforce():
  initial = input("Give the encrypted message : ")
  
  shift = 0
  output = ""
  
  for i in range(26):
    output = ""
    shift +=1
    for char in initial:
      if char in letters:
        output += letters[(letters.index(char) + shift) % len(letters)]
    print(str(i) + " : " + output)
