function getReversedArray(arr) {
    const n = arr.length;
    let newArr = new Array(n);
    for(let index in arr) {
        newArr[index] = arr[n-1-index]
    }
    return newArr;
}

const input = [1, 2, 3, 4, 5];
const output = getReversedArray(input);
console.log(output);