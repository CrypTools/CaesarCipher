#include "message.h"

void message::encrypt(std::string messageToEncrypt, int setShift){
    this->setShift = setShift;
    int x = 0;

    for(int i = 97; i <= 122; i++){
        alpha.push_back(i);
        x++;
    }

    for(const auto& letterE : messageToEncrypt){
            for(size_t v = 0; v < alpha.size(); v++){
                int shift = ((1 * v) + setShift) % 26;

                if(letterE == alpha[v]){
                        encryptedMessage.push_back(alpha[shift]);
            }
        }
    }
    std::string str(encryptedMessage.begin(), encryptedMessage.end());
    stre = str;
    std::cout << "Encrypted to: " << stre << std::endl;

}

void message::decrypt(){
    std::cout << "Decrypted to: ";
    for(const auto& letterD : stre){
            for(size_t v = 0; v < alpha.size(); v++){
                int shift = ((1 * v) - setShift);
                if(shift < 0){shift = 24;};
                if(letterD == alpha[v]){
                        std::cout << alpha[shift];
            }
        }

    }
}
