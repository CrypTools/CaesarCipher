#include <iostream>
#include <message.h>

int main()
{
    message message1;
    message1.encrypt("zattackz", 2);
    message1.decrypt();


    return 0;
}
