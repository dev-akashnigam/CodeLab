function isPalindrome(str) {
    const n = str.length;
    let leftPointer = 0;
    let rightPointer = n-1;

    while(leftPointer<rightPointer) {
        if(str[leftPointer] == str[rightPointer]) {
            leftPointer++;
            rightPointer--;
            continue;
        } else {
            return false;
        }
    }
    return true;
}

const input = "nitin";
const output = isPalindrome(input);
console.log(output);