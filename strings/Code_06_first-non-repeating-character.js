function getFirstNonRepeatingCharacter(str) {
    let myMap = new Map();
    for(let ch of str) {
        if(myMap.has(ch)) {
            myMap.set(ch, myMap.get(ch)+1);
        } else {
            myMap.set(ch, 1);
        }
    }

    for(let key of myMap.keys()) {
        let value = myMap.get(key);
        if(value==1) {
            return key;
        } else {
            continue;
        }
    }
}

const input = "swiss";
const output = getFirstNonRepeatingCharacter(input);
console.log(output);