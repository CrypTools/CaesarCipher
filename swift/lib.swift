/*********************************
 *
 * Use: "Hello World!".encrypt(4)
 * => "Lipps$[svph%"
 *      "Lipps$[svph%".decrypt(4)
 * => "Hello World!"
 *
 *********************************/
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
