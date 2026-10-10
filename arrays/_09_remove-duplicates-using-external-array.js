function removeDuplicateElements(arr) {
    let newArr = [];
    for(let element of arr) {
        if(newArr.includes(element)) {
            continue;
        } else {
            newArr.push(element);
        }
    }
    return newArr;
}

const input = [1, 2 ,3, 2, 4, 5, 1];
const output = removeDuplicateElements(input);
console.log(output);