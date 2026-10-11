def check_anagrams(s1, s2):
    n1 = len(s1)
    n2 = len(s2)
    if n1!=n2:
        return False
    my_dict_1 = dict()
    my_dict_2 = dict()
    for i in range(0, n1, 1):
        if s1[i] in my_dict_1:
            my_dict_1[s1[i]] = my_dict_1[s1[i]] + 1
        else:
            my_dict_1[s1[i]] = 1

        if s2[i] in my_dict_2:
            my_dict_2[s2[i]] = my_dict_2[s2[i]] + 1
        else:
            my_dict_2[s2[i]] = 1
    return my_dict_1==my_dict_2

input1 = "dormitory"
input2 = "dirtyroom"
output = check_anagrams(input1, input2)
print(output)

        