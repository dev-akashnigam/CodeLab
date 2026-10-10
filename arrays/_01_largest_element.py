def get_largest_element(arr):
    largest_element = -99999999
    for element in arr:
        if element>largest_element:
            largest_element=element
    return largest_element

input = [10, 5, 20, 8, 15]
output = get_largest_element(input)
print(output)