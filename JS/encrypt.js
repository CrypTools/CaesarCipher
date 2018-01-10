/********************************
*
* Use: "Hello World!".encrypt(4)
* => 'Lipps$[svph%'
*
********************************/
String.prototype.encrypt = function(n) {
	let out = "";
	for (let i of this) {
		out += String.fromCharCode(i.charCodeAt(0) + n)
	}
	return out;
}
module.exports = (text, n) => text.encrypt(n)
