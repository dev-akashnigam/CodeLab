function removeDuplicates(arr) {
    let set = new Set();
    for(let element of arr) {
        set.add(element);
    }
    const n = set.size;
    let newArr = [];
    for(let element of set) {
        newArr.push(element);
    }
    return newArr;
}

const input = [1, 2 ,3, 2, 4, 5, 1];
const output = removeDuplicates(input);
console.log(output);