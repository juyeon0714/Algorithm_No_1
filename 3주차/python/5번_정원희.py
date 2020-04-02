def solution(heights):
    answer = [0 for i in heights]

    for i in range(len(heights)-1,-1 ,-1):
        for j in range(i-1,-1,-1):
            if heights[j]> heights[i]:
                answer[i]=j+1
                break
            continue

    return answer

print(solution([6,9,5,7,4]))