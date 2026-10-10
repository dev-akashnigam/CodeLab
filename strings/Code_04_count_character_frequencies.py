def print_character_frequencies(s):
    my_dict = dict()
    for ch in s:
        if ch in my_dict:
            my_dict[ch] += 1
        else:
            my_dict[ch] = 1
    print(my_dict)

input = "programming"
print_character_frequencies(input)

