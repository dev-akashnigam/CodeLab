function getMutableString(str) {
    let strArr = [];
    for(let ch of str) {
        strArr.push(ch);
    }
    return strArr;
}

const input = "Hello";
const output = getMutableString(input);
console.log(output);
