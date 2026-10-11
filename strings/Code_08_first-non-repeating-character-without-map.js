function getFirstNonRepeatingChar(str) {
    const n = str.length;
    for(let i=0; i<n; i++) {
        let currentChar = str[i];
        let leftSubstring = str.substring(0, i);
        let rightSubstring = str.substring(i+1, n);
        if(leftSubstring.includes(currentChar) || rightSubstring.includes(currentChar)) {
            continue;
        } else {
            return currentChar;
        }
    }
    return null;
}

const input = "aabbcc";
const output = getFirstNonRepeatingChar(input);
console.log(output);