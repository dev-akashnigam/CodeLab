def get_largest_element(arr):
    arr.sort(reverse=True)
    return arr[0]

input = [10, 5, 20, 8, 15]
output = get_largest_element(input)
print(output)