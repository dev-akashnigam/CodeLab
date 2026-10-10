def is_array_sorted(arr):
    n = len(arr)
    ascending_sort = True
    descending_sort = True


    for i in range(1, n, 1):
        if arr[i-1] <= arr[i]:
            continue
        else:
            ascending_sort = False
            break

    for i in range(1, n, 1):
        if arr[i-1] >= arr[i]:
            continue
        else:
            descending_sort = False
            break

    return ascending_sort or descending_sort

input = [1, 3, 2, 4]
output = is_array_sorted(input)
print(output)
        