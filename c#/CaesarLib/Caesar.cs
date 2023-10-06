using System;

namespace CaesarLib
{
    public class Caesar
    {
        private static char[] _letters = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };
        /// <summary>
        /// Encrypt string using Caesar Cipher
        /// </summary>
        /// <param name="text">string to encrypt</param>
        /// <param name="shift">Shift by how many letters</param>
        /// <returns>encrypted string</returns>
        static public string Encrypt(string text, int shift)
        {
            var lowercaseText = text.ToLower();
            char[] message = new char[text.Length];
            for(int i = 0; i < text.Length; i++)
            {
                int index = Array.IndexOf(_letters,lowercaseText[i]);
                message[i] = _letters[MathMod(index+shift,  _letters.Length) ];
            }
            return new string(message).ToUpper();
        }
        static public string Decrypt(string encryptedString, int shift) 
        {
            var lowercaseText = encryptedString.ToLower();
            char[] message = new char[encryptedString.Length];
            for (int i = 0; i < encryptedString.Length; i++)
            {
                int index = Array.IndexOf(_letters,lowercaseText[i]);
                message[i] = _letters[MathMod(index-shift,  _letters.Length) ];
            }
            return new string(message).ToUpper();
        }

        static int MathMod(int a, int b) //https://stackoverflow.com/questions/2691025/mathematical-modulus-in-c-sharp/2691042#2691042
        {
            return (Math.Abs(a * b) + a) % b;
        }
    }
}
