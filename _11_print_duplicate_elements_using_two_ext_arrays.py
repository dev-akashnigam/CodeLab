def print_all_duplicates(arr):
    elements = []
    counts = []
    for element in arr:
        if element in elements:
            element_index = elements.index(element)
            counts[element_index] += 1
        else:
            elements.append(element)
            counts.append(1)

    n = len(elements)
    for i in range(0, n, 1):
        if counts[i] > 1:
            print(elements[i])

input = [1, 2 ,3, 2, 4, 5, 1]
print_all_duplicates(input)

