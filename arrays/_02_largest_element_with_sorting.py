def get_largest_element(arr):
    arr.sort()
    return arr[-1]

input = [10, 5, 20, 8, 15]
output = get_largest_element(input)
print(output)