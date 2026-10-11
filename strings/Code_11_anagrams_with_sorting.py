def are_strings_anagrams(s1, s2):
    n1 = len(s1)
    n2 = len(s2)
    if n1!=n2:
        return False
    s1_arr = []
    s2_arr = []
    for i in range(0, n1, 1):
        s1_arr.append(s1[i])
        s2_arr.append(s2[i])
    s1_arr.sort()
    s2_arr.sort()
    return s1_arr == s2_arr

input1 = "hello"
input2 = "world"
output = are_strings_anagrams(input1, input2)
print(output)