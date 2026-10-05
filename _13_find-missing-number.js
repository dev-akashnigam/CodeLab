function getMissingNumber(arr) {
    const n = arr.length;
    const expectedSum = ((n+1)*(n+2))/2;
    let actualSum = 0;
    for(let element of arr) {
        actualSum += element
    }
    return expectedSum-actualSum;
}

const input = [1, 2, 3, 5, 6];
const output = getMissingNumber(input);
console.log(output);