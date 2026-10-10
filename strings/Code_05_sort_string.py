def get_sorted_string(s):
    chr_arr = []
    for ch in s:
        chr_arr.append(ch)
    chr_arr.sort()
    chr_arr.reverse()
    s = "".join(chr_arr)
    return s

input = "dcab"
output = get_sorted_string(input)
print(output)