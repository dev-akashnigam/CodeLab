def remove_duplicates(arr):
    n = len(arr)
    new_arr = []
    for element in arr:
        if element in new_arr:
            continue
        else:
            new_arr.append(element)
    return new_arr

input = [1, 2 ,3, 2, 4, 5, 1]
output = remove_duplicates(input)
print(output)