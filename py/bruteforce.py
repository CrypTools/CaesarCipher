LETTERS = 'abcdefghijklmnopqrstuvwxyz'

def bruteforce(initial):
  """ Use : bruteforce('gymmuay')
=> 'end'
  """
  initial = initial.lower()
  
  shift = 0
  output = ""
  
  for i in range(26):
    output = ""
    shift +=1
    for char in initial:
      if char in LETTERS:
        output += LETTERS[(LETTERS.index(char) + shift) % len(LETTERS)]
    print(str(i) + " : " + output)
  return "end"
