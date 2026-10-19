/*
Problem statement
You are given an array of integers that may contain zero and nonzero elements.

Your task is to move all zeros to the end of the array while preserving the relative order of all nonzero elements.

You must modify the original array in place, without creating another array to store the result.

The array must retain the same length, and you must not lose or duplicate any elements.

Example 1: Basic case
Input:
nums = [0, 1, 0, 3, 12]

Output:
[1, 3, 12, 0, 0]
*/

function getArrayWithZeroMovedToEnd(arr) {
    const n = arr.length;
    for(let i =0; i<n; i++) {
        if(arr[i]==0) {
            arr.splice(i, 1);
        }
    }
    const n_new = arr.length;
    const n_diff = n - n_new;
    if(n_diff==0) {
        return arr;
    } else {
        for(let j=0; j<n_diff; j++) {
            arr.push(0);
        }
    }
    return arr;
}

const input = [0, 1, 0, 3, 12]
const output = getArrayWithZeroMovedToEnd(input);
console.log(output);