// Test made using EyeJS - https://eye.js.org

const path = require('path').normalize(__testDir + "/../js/")

const encrypt = require(path + "encrypt.js")
const decrypt = require(path + "decrypt.js")


eye.test("Encryption", "node",
	$ => $(encrypt("Hello World!", 4)).Equal("Lipps$[svph%")
)
eye.test("Decryption", "node",
	$ => $(decrypt("Lipps$[svph%", 4)).Equal("Hello World!"),
	$ => $(decrypt(encrypt("attack", 4), 4)).Equal("attack")
)
