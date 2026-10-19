def get_max_profit(arr):
    #print(arr)
    n = len(arr)
    max_profit = 0
    for i in range(0, n, 1):
        current_buy_price = arr[i]
        for j in range(i+1, n, 1):
            current_sell_price = arr[j]
            #print(f"Buy price = {current_buy_price}, Sell Price = {current_sell_price}")
            if current_sell_price > current_buy_price:
                current_profit = current_sell_price - current_buy_price
                #print(f"Profit = {current_profit}")
                #print(f"Max Profit = {max_profit}")
                if current_profit > max_profit:
                    max_profit = current_profit
                    #print(f"New Max Profit = {max_profit}")
    return max_profit

input = [3, 8, 2, 5, 1]
output = get_max_profit(input)
print(output)

