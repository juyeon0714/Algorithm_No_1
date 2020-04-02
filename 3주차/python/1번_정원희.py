def solution(answers):
    a =[1,2,3,4,5]*2000
    b = [2,1,2,3,2,4,2,5]*1250
    c = [3,3,1,1,2,2,4,4,5,5]*1000
    answer =[0,0,0]
    for i in range(len(answers)):
        if answers[i] ==a[i]:
            answer[0] +=1
        if answers[i] ==b[i]:
            answer[1]+=1
        if answers[i] ==c[i]:
            answer[2]+=1
    ma = max(answer)
    ra =[]
    for i in range(len(answer)):
        if answer[i] ==ma:
          ra.append(i+1)

    return ra

# def solution(answers):
#     answer={1:0,2:0,3:0}
#     a =[1,2,3,4,5]*200
#     b = [2,1,2,3,2,4,2,5]*125
#     c = [3,3,1,1,2,2,4,4,5,5]*100
#
#     for i in range(len(answers)):
#         if answers[i] ==a[i]:
#             answer[1]+=1
#         if answers[i] ==b[i]:
#             answer[2]+=1
#         if answers[i] ==c[i]:
#             answer[3]+=1
#     ma = max(answer.values())
#     ra = []
#     for name, age in answer.items():
#         if age == ma:
#             ra.append(name)
#     return ra
print(solution([5,4,4,2,1]		))