function printAllDuplicateElements(arr) {
    let map = new Map();

    for(let element of arr) {
        if(map.has(element)) {
            let currentElementCount = map.get(element);
            map.set(element, currentElementCount+1);
        } else {
            map.set(element, 1);
        }
    }

    for(let [key, value] of map) {
        if(value > 1) {
            console.log(key);
        }
    }
}

const input = [1, 2 ,3, 2, 4, 5, 1];
printAllDuplicateElements(input);
