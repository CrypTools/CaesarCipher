LETTERS = 'abcdefghijklmnopqrstuvwxyz'

def decrypt(initial, shift):
  """ Use : decrypt('gymmuay', 98)
=> 'message'
Decrypts text enciphered using Caesar Cipher.
  """
  initial = initial.lower()
  output = ""

  for char in initial:
    if char in LETTERS:
      output += LETTERS[(LETTERS.index(char) - shift) % len(LETTERS)]
      
  return output
