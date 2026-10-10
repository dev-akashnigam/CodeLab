function printSwappedValues(a, b) {
    [a, b] = [b, a];
    console.log(`a = ${a}, b = ${b}`);
}

const a = 10;
const b = 20;
printSwappedValues(a, b);