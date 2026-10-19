def find_leaders(arr):
    n = len(arr)
    largest_ele_so_far = -999999999
    for i in range(n-1, -1, -1):
        if(arr[i] > largest_ele_so_far):
            largest_ele_so_far = arr[i]
            print(arr[i])

input = [10, 4, 2, 4, 1]
find_leaders(input)
