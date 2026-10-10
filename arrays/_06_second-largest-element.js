function getSecondLargestElement(arr) {
    let largestElement = arr[0];
    let secondLargestElement = -999999999;

    for(let element of arr) {
        if(element > largestElement) {
            secondLargestElement = largestElement;
            largestElement = element;
        } else if(element < largestElement && element > secondLargestElement) {
            secondLargestElement = element;
        } else {
            continue;
        }
    }
    return secondLargestElement;
}

const input = [10, 10, 5];
const output = getSecondLargestElement(input);
console.log(output);