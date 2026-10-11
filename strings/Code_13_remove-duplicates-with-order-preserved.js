function removeDuplicates(str) {
    let output = "";
    let mySet = new Set();
    for(let ch of str) {
        if(mySet.has(ch)) {
            continue;
        } else {
            mySet.add(ch);
            output += ch;
        }
    }
    return output;
}

const input = "programming";
const output = removeDuplicates(input);
console.log(output);