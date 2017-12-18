import string 

letters = 'abcdefghijklmnopqrstuvwxyz'

def encrypt():
  initial = input('Give the message to encrypt (no space or special characters) : ')

  initial = initial.lower()

  shift = int(input("Give the value of the shift : "))

  output = ""

  for char in initial:
    if char in letters:
      output += letters[(letters.index(char) + shift) % len(letters)]

  print("The encrypted message is : " + output)
