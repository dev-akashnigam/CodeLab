function isArraySorted(arr) {
    const n = arr.length;
    let ascendingSorted = true;
    let descendingSorted = true;

    for(let i=1; i<n; i++) {
        if(arr[i-1] <= arr[i]) {
            continue;
        } else {
            ascendingSorted = false;
            break;
        }
    }

    for(let i=1; i<n; i++) {
        if(arr[i-1] >= arr[i]) {
            continue;
        } else {
            descendingSorted = false;
            break;
        }
    }

    return ascendingSorted || descendingSorted;
}

const input = [1, 3, 2, 5];
const output = isArraySorted(input);
console.log(output);