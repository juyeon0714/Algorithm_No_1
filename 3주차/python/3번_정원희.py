def solution(arrangement):
    pre= 0
    answer= 0
    l = []
    for i in arrangement:
        if i =='(':
            l.append(1)
            answer +=1
            pre +=1
        else:
            l.pop()
            if pre !=0:
                answer +=sum(l)
                answer -= 1
            pre =0

    return answer

print(solution("()(((()())(())()))(())"))