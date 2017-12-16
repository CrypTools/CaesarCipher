import string 

letters = 'abcdefghijklmnopqrstuvwxyz'

def decrypt():
  initial = input('Give the message (no space or special characters) : ')
  
  initial = initial.lower()
  output = ""
  
  shift = int(input("Give the value of the shift used : "))

  for char in initial:
    if char in letters:
      output += letters[(letters.index(char) - shift) % len(letters)]
      
  print("The decrypted message is  : " + output)
