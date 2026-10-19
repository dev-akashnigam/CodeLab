/*
Problem statement
You are given an array of integers. Find and return the second-largest distinct element in the array without sorting it.
The word distinct is important: duplicate occurrences of the same value must be treated as a single value when determining the largest and second-largest elements.

Example 1: Basic case
Input:
nums = [10, 20, 30, 40, 50]

Output:
40
*/

function getSecondLargestElement(arr) {
    const n = arr.length;
    let largestElement = -999999999;
    let secondLargestElement = -999999999;
    for(let i=0; i<n; i++) {
        let currentElement = arr[i];
        if(currentElement>largestElement) {
            secondLargestElement = largestElement;
            largestElement = currentElement;
        } else if(currentElement>secondLargestElement && currentElement<largestElement) {
            secondLargestElement = currentElement;
        } else {
            continue;
        }
    }
    return secondLargestElement;
}

const input = [5, 5, 5, 3, 1];
const output = getSecondLargestElement(input);
console.log(output);