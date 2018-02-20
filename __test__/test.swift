import Foundation

extension String {
    func encrypt(_ n: Int) -> String {
        var out = "";
        let unicode = Array(self.unicodeScalars.map { $0.value }).map { Int($0) }
        for i in unicode {
            out += String(Character(UnicodeScalar(i + n)!))
        }
        return out
    }
    func decrypt(_ n: Int) -> String {
        var out = "";
        let unicode = Array(self.unicodeScalars.map { $0.value }).map { Int($0) }
        for i in unicode {
            out += String(Character(UnicodeScalar(i - n)!))
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
