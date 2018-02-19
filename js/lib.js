/************************

Simple bridge

***********************/

const encrypt = require("./encrypt")
const decrypt = require("./decrypt")

module.exports = {
	encrypt: encrypt,
	decrypt: decrypt
}
