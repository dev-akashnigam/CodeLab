function moveZerosToEnd(arr) {
    const n = arr.length;
    let leftPointer = 0;
    let rightPointer = n-1;

    while(leftPointer<rightPointer) {
        if(arr[leftPointer] == 0) {
            let temp = arr[leftPointer];
            arr[leftPointer] = arr[rightPointer];
            arr[rightPointer] = temp;

            leftPointer++;
            rightPointer--;
        } else {
            leftPointer++;
        }
    }
    return arr;
}

const input = [0, 1, 0, 3, 12];
const output = moveZerosToEnd(input);
console.log(output);