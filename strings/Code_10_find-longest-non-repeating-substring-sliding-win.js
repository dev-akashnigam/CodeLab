function findLongestNonRepeatingSubs(str) {
    const n = str.length;
    let mySet = new Set();
    let leftPointer = 0;
    let rightPointer = 1;
    mySet.add(str[leftPointer]);
    let longestSubs = "";
    let longestSubsLength  = -999999999;
    while(rightPointer<n) {
        if(mySet.has(str[rightPointer])) {
            while(str[leftPointer]!=str[rightPointer]) {
                mySet.delete(str[leftPointer]);
                leftPointer++;
            }
            leftPointer++;
        } else {
            mySet.add(str[rightPointer]);
            let currentSubs = str.substring(leftPointer, rightPointer+1);
            let currentSubsLength = currentSubs.length;
            if(currentSubsLength > longestSubsLength) {
                longestSubsLength = currentSubsLength;
                longestSubs = currentSubs;
            }
        }
        rightPointer++;
    }
    return longestSubs;
}

const input = "abcdeaf";
const output = findLongestNonRepeatingSubs(input);
console.log(output);