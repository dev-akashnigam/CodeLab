def remove_duplicate_chars(str):
    output = ""
    my_set = set()
    for ch in str:
        if ch in my_set:
            continue
        else:
            my_set.add(ch)
            output += ch
    return output

input = "programming"
output = remove_duplicate_chars(input)
print(output)