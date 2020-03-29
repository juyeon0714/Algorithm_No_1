def solution(seoul):
    # answer = '김서방은 %d에 있다.'
    for i in range(0,len(seoul)):
        if seoul[i] == "Kim":
            answer = "김서방은 "+str(i)+"에 있다"
    return answer

print(solution(["Jane", "Kim"]))