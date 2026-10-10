def get_second_largest_element(arr):
    largest_element = arr[0]
    second_largest_element = -999999999
    for element in arr:
        if element > largest_element:
            second_largest_element = largest_element
            largest_element = element
        elif element < largest_element and element > second_largest_element:
            second_largest_element = element
        else:
            continue
    return second_largest_element

input = [10, 10, 5]
output = get_second_largest_element(input)
print(output)
