function getLargestElement(arr) {
    const n = arr.length;
    arr.sort((a, b) => {
        return b-a;
    });
    return arr[0];
}

const input = [10, 5, 20, 8, 15];
const output = getLargestElement(input);
console.log(output);
