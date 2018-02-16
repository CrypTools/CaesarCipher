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

// Basic testing for swift

#if os(Linux) || os(FreeBSD)
    import Glibc
#else
    import Darwin
#endif

func test() -> Int {
    print("Testing Encryption")
    if "Hello World!".encrypt(n: 4) == "Lipps$[svph%" {
        print("Done! No problems")
    } else {
        print("Oups!\n \"Hello World!\".encrypt(n: 4) isn't equal to \"Lipps$[svph%\"")
        print("Output: \("Hello World!".encrypt(n: 4))")
        exit(1)
    }

    print("Testing Decryption")
    if "Lipps$[svph%".decrypt(n: 4) == "Hello World!" {
        print("Done! No problems")
    } else {
        print("Oups!\n \"Lipps$[svph%\".decrypt(n: 4) isn't equal to \"Hello World!\"")
        print("Output: \("Lipps$[svph%".decrypt(n: 4))")
        exit(1)
    }
    print("Tests are done.")
    return 0
}

let exec = test()
