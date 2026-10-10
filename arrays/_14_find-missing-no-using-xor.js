function getMissingNumber(arr) {
    let xorOfArrayElements = 0;
    for(let element of arr) {
        xorOfArrayElements = xorOfArrayElements ^ element;
    }

    let n = arr.length;
    let xorOfLoopElements = 0;
    for(let i=1; i<n+2; i++) {
        xorOfLoopElements = xorOfLoopElements ^ i;
    }

    let missingElement = xorOfArrayElements ^ xorOfLoopElements;
    return missingElement;
}

const input = [1, 2, 3, 5, 6];
const output = getMissingNumber(input);
console.log(output);