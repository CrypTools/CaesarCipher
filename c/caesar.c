// CrypTools - GitHub
// Tuesday, 14 August 2018
// Caesar Cipher to encrypt text

/*****
Compile:
$ make
Use:
$ ./caesar KEYNUM < file.txt
*****/

#include <stdio.h>
#include <stdlib.h>
#include <assert.h>

#define MINCAP 65
#define MAXCAP 90

#define MINLOW 97
#define MAXLOW 122

void encode (int shiftNumber, char letter);

// Takes an int and a file containing text to encrypt
int main (int argc, char *argv[]) {
    int shift = 0;
    int c = 0;
    // set shift
    shift = atoi (argv[1]);
    while ((c = getchar()) != EOF) {
        encode(shift, c);
    }
    printf("\n");
    return EXIT_SUCCESS;
}

/* takes a character and increments it by shift */
void encode (int shift, char letter) {
    int numAscii = letter;
    int firstLetter;
    if (numAscii >= MINCAP && numAscii <= MAXCAP) {
        firstLetter = MINCAP;
    } else if (numAscii >= MINLOW && numAscii <= MAXLOW) {
        firstLetter = MINLOW;
    } else {
        putchar(letter);
        return;
    }
    numAscii -= (firstLetter - shift);
    numAscii = (numAscii % 26);
    numAscii += firstLetter;
    putchar(numAscii);
}

