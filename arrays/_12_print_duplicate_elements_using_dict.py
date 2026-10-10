def print_all_duplicates(arr):
    my_dict = dict()
    for element in arr:
        if element in my_dict:
            current_element_count = my_dict[element]
            my_dict[element] = current_element_count + 1
        else:
            my_dict[element] = 1
    for key, value in my_dict.items():
        if value > 1:
            print(key)

input = [1, 2 ,3, 2, 4, 5, 1]
print_all_duplicates(input)
