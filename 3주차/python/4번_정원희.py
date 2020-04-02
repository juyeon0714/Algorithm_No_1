def solution1(n):
    answer = [0]
    while n-1:
        re_an = []
        for i in answer:
            if i ==0:
                re_an.append(1)
            else:
                re_an.append(0)
        answer.append(0)
        re_an.reverse()
        answer += re_an;
        n -=1
    return answer

def solution2(n):
    answer = [0]
    for i in range(n - 1):
        answer = answer + [0] + [i ^ 1 for i in answer[::-1]]
    return answer

print(solution1(2))


