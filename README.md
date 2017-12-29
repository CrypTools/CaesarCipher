# Caesar Cipher

## History and usage

The *Caesar Cipher* was named after Julius Caesar (100 B.C. – 44 B.C). He would use the cipher for secret communication (protect messages of military significance). The Caesar Cipher is a substitution cipher. Originally, Julius Caesar would use a shift of three to encrypt/decrypt a message.

## Detailed Explanations : How it works?

1. Firstly, each character of the initial text (message to encrypt) is converted in a number from 0 to 25, corresponding to its position in the Latin alphabet which contains 26 letters --> (a = 0, b = 1 ... z = 25 ).

2. Then, each number obtained is transformed by an affine function (1x + b). "x" is representing the number while "b" is defined during the encryption. "b" is the key used to decrypt the final message.

3. If we take all the images and put them in a list, we obtain n numbers corresponding to n charcaters of the initial text. The next step consists in finding the values of mudulo 26 of each number. (**Modulo means remainder**)

> Example : Modulo 4 of 19 is **3** because 15 = 4 * 4 + **3** In the other hand, modulo 26 of 26 is **0** because 26 = 26 * 1 + **0**

4.  Therefore, we cobtain a new list with n element, each between 0 and 25 both included. All these numbers are converted in letters of the Latin Alphabet using the tables below.

5. We finally create the final message by putting all the letters side by side.

tables : 

| A | B | C | D | E | F | G | H | I | J | K  | L  | M  |
|---|---|---|---|---|---|---|---|---|---|----|----|----|
| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 |

| N  | O  | P  | Q  | R  | S  | T  | U  | V  | W  | X  | Y  | Z  |
|----|----|----|----|----|----|----|----|----|----|----|----|----|
| 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 | 21 | 22 | 23 | 24 | 25 |

## Weaknesses

- As 

- We can also use 

Image centered : 

<p align="center"> 
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/English_letter_frequency_%28alphabetic%29.svg/340px-English_letter_frequency_%28alphabetic%29.svg.png">
</p>

- Other possibilities include

- Knowing 

## Example

(Write all steps)

- 
- 
- 
- 
