#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAXLEN 9000

void encrypt (int shiftNumber, char textToEncrypt[]);

/* Takes an int, and some characters to encrypt */
int main(int argc, char *argv[]) {
  int i, c;
  char input[MAXLEN] = "";
  int shift = 0;

  /* set shift */
  if (argc > 1) {
    shift = atoi (argv[1]);
  }

  /* set input */
  if (argc > 2) {
    strcpy(input, argv[2]);
  } else {
    for (i = 0; i < MAXLEN - 1 && (c=getchar()) != EOF; i++) {
      input[i] = c;
    }
    input[++i] = '\0';
  }

  encrypt(shift, &input[0]);
  printf("%s", input);

}

void encrypt(int shift, char text[])
{
  while (*text) {
    *text += shift;

    while (*text > 126) {
      *text = *text - 95;
    }
    while (*text < 32) {
      *text = *text + 95;
    }
    
    text++;
  }
}
