def get_missing_number(arr):
    xor_of_array_elements = 0
    for element in arr:
        xor_of_array_elements = xor_of_array_elements ^ element

    n = len(arr)
    xor_of_loop_elements = 0
    for i in range(1, n+2, 1):
        xor_of_loop_elements = xor_of_loop_elements ^ i

    missing_element = xor_of_array_elements ^ xor_of_loop_elements
    return missing_element

input = [1, 2, 3, 5, 6]
output = get_missing_number(input)
print(output)