function checkAnagrams(str1, str2) {
    const n1 = str1.length;
    const n2 = str2.length;
    if(n1 != n2) {
        return false;
    }

    let myMap1 = new Map();
    let myMap2 = new Map();

    for(let i=0; i<n1; i++) {
        if(myMap1.has(str1[i])) {
            myMap1.set(str1[i], myMap1.get(str1[i])+1);
        } else {
            myMap1.set(str1[i], 1);
        }

        if(myMap2.has(str2[i])) {
            myMap2.set(str2[i], myMap2.get(str2[i])+1);
        } else {
            myMap2.set(str2[i], 1);
        }
    }

    for(let key of myMap1.keys()) {
        if(myMap2.has(key)) {
            if(myMap1.get(key)==myMap2.get(key)) {
                continue;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    return true;
}

const input1 = "abcd";
const input2 = "abc";
const output = checkAnagrams(input1, input2);
console.log(output);