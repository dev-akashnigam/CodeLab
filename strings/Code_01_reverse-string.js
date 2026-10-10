function getReversedString(str) {
    const n = str.length;
    let revStr = "";
    for(let i=n-1; i>=0; i--) {
        revStr += str[i]
    }
    return revStr;
}

const input = "Mphasis";
const output = getReversedString(input);
console.log(output);