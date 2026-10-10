function printCharacterFrequencies(str) {
    let myMap = new Map();
    for(let ch of str) {
        if(myMap.has(ch)) {
            myMap.set(ch, myMap.get(ch)+1);
        } else {
            myMap.set(ch, 1);
        }
    }
    console.log(myMap);
}

const input = "programming";
printCharacterFrequencies(input);