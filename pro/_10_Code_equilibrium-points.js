function findAllEquilibriumPoints(arr) {
    const n = arr.length;
    let sum = 0;
    for(let element of arr) {
        sum += element;
    }

    let leftSum = 0;
    let rightSum = 0;
    for(let i=0; i<n; i++) {
        leftSum = leftSum + arr[i];
        rightSum = sum - leftSum + arr[i];
        if(leftSum == rightSum) {
            console.log(i);
        }
    }
}

const input = [-7, 1, 5, 2, -4, 3, 0];
findAllEquilibriumPoints(input);