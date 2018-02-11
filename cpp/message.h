#ifndef MESSAGE_H
#define MESSAGE_H
#include <iostream>
#include <vector>

class message
{
    public:
        void encrypt(std::string messageToEncrypt, int setShift);
        void decrypt();

    private:
        std::vector<char> alpha, encryptedMessage;
        std::string messageToEncrypt, stre;
        int setShift;
};

#endif // MESSAGE_H
