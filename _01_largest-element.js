function getLargestElement(arr) {
    let largestElement = -99999999;
    for(let element of arr) {
        if(element>largestElement){
            largestElement = element;
        }
    }
    return largestElement;
}

const input = [10, 5, 20, 8, 15];
const output = getLargestElement(input);
console.log(output);