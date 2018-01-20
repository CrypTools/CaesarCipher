#include <stdio.h>
#include <stdlib.h>

void encrypt(char *string, int places);

int main(int argc, char* argv[])
{
	if (argv[2] && argv[1]) {
		int places; 
		char *string = argv[2];
		char *p;
		places = strtol(argv[1], &p, 10);
		encrypt(string, places);
		printf("%s\n", string);
	} else {
		printf("No text to encrypt, try './encrypt 1 \"Hello World\"'\n");
	}
}

void encrypt(char *c, int places)
{
	while (*c != '\0') {
		*c += places;
		c++;
	}
}


