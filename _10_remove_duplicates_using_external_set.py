def remove_duplicates(arr):
    my_set = set()
    for element in arr:
        my_set.add(element)

    new_arr = []
    for element in my_set:
        new_arr.append(element)
    return new_arr

input = [1, 2 ,3, 2, 4, 5, 1]
output = remove_duplicates(input)
print(output)