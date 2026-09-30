function getLargestElement(arr) {
    const n = arr.length;
    arr.sort((a, b) => {
        return a-b;
    });
    return arr[n-1];
}

const input = [10, 5, 20, 8, 15];
const output = getLargestElement(input);
console.log(output);
