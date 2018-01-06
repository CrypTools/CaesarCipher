/*********************************
*
* Use: "Hello World!".encrypt(n: 4)
* => "Lipps$[svph%"
*      "Lipps$[svph%".decrypt(n: 4)
* => "Hello World!"
*
*********************************/
import Foundation

// Get array of ascii values from string
extension String {
    var asciiArray: [UInt32] {
        return unicodeScalars.filter{$0.isASCII}.map{$0.value}
    }
}
extension Character {
    var asciiValue: UInt32? {
        return String(self).unicodeScalars.filter{$0.isASCII}.first?.value
    }
}
// main
extension String {
    func encrypt(n: Int) -> String {
        var out = "";
        for i in self {
            out += String(Character(UnicodeScalar(Int(i.asciiValue!) + n)!))
        }
        return out
    }
    func decrypt(n: Int) -> String {
        var out = "";
        for i in self {
            out += String(Character(UnicodeScalar(Int(i.asciiValue!) - n)!))
        }
        return out
    }
}
