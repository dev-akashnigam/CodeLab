function checkAnagrams(str1, str2) {
    const n1 = str1.length;
    const n2 = str2.length;
    if(n1!=n2) {
        return false;
    } else {
        let str1_arr = [];
        let str2_arr = [];
        for(let i=0; i<n1; i++) {
            str1_arr.push(str1[i]);
            str2_arr.push(str2[i]);
        }
        str1_arr.sort();
        str2_arr.sort();
        return str1_arr.every(function (element) {
            return str2_arr.includes(element);
        });
    }
}

const input1 = "schoolmaster";
const input2 = "theclassroom";
const output = checkAnagrams(input1, input2);
console.log(output);