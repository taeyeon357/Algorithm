def solution(s):
    answer = []
    answer.append(-1)
    for i in range(1,len(s)):
        cnt = 0
        b_p = 0
        for j in range(i-1,-1,-1):
            cnt += 1
            if s[i] == s[j]:
                answer.append(cnt)
                b_p = 1
                break
        if b_p == 0:
            answer.append(-1)
    return answer