def get_reversed_array(arr):
    n = len(arr)
    new_arr = [0]*n
    for i in range(0, n, 1):
        new_arr[n-1-i] = arr[i]
    return new_arr

input = [1, 2, 3, 4, 5]
output = get_reversed_array(input)
print(output)
