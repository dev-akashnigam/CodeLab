function printAllDuplicates(arr) {
    let elements = [];
    let counts = [];
    for(let element of arr) {
        if(elements.includes(element)) {
            let elementIndex = elements.indexOf(element);
            counts[elementIndex]++;
        } else {
            elements.push(element);
            counts.push(1);
        }
    }
    const n = elements.length;
    for(let i=0; i<n; i++) {
        if(counts[i] > 1) {
            console.log(elements[i]);
        }
    }
}

const input = [1, 2 ,3, 2, 4, 5, 1];
printAllDuplicates(input);