using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CaesarLib
{
    public class Caesar
    {
        static public string Encrypt(string text, int shift)
        {
            string message = null;
            for(int i = 0; i < text.Length; i++)
            {
                int ASCII = (int)text[i];
                message += (char)(ASCII + shift);
            }
            return message;
        }
    }
}
