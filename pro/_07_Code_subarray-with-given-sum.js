function getSubarrayWithGivenSum(arr, sum) {
    const n = arr.length;
    let currentSum = 0;
    let myMap = new Map();

    for(let i=0; i<n; i++) {
        currentSum += arr[i];
        myMap.set(currentSum, i);

        let requiredSum = currentSum - sum;
        if(myMap.has(requiredSum)) {
            return [myMap.get(requiredSum)+1, i]
        }
    }
    return [-1, -1]
}

const inputArr = [10, 15, -5, 15, -10, 5];
const inputSum = 5;
const output = getSubarrayWithGivenSum(inputArr, inputSum);
console.log(output);