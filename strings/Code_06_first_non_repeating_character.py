def get_first_non_repeating_character(s):
    my_dict = dict()
    for ch in s:
        if ch in my_dict:
            my_dict[ch] += 1
        else:
            my_dict[ch] = 1
    for key in my_dict:
        if my_dict[key]==1:
            return key
        else:
            continue

input = "swiss"
output = get_first_non_repeating_character(input)
print(output)