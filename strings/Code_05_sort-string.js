function getSortedString(str) {
    let chrArr = [];
    for(let ch of str) {
        chrArr.push(ch);
    }
    chrArr.sort();
    let sortedStr = chrArr.join("");
    return sortedStr;
}

const input = "dcab";
const output = getSortedString(input);
console.log(output);