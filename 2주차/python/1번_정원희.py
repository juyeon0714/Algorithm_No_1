def solution(n):
    answer  =[]
    while n >0:
        if n %2 ==1:
            answer.insert(0,"수")
        else:
            answer.insert(0,"박")
        n-=1
    return ''.join(answer)

print(solution(3))