function getMaxProfit(arr) {
    const n = arr.length;
    let minPurchasePrice = 999999999;
    let maxProfit = -999999999;
    let buyIndex = -1;
    let sellIndex = -1;
    let minPurchaseIndex = -1;
    for(let i=0; i<n; i++) {
        let currentPrice = arr[i];

        if(currentPrice < minPurchasePrice) {
            minPurchasePrice = currentPrice;
            minPurchaseIndex = i;
        }

        let currentProfit = currentPrice - minPurchasePrice;
        if(currentProfit > maxProfit) {
            maxProfit = currentProfit;
            buyIndex = minPurchaseIndex;
            sellIndex = i;
        }
    }
    return [maxProfit, buyIndex, sellIndex];
}

const input = [3, 8, 2, 5, 1];
const output = getMaxProfit(input);
console.log(output);