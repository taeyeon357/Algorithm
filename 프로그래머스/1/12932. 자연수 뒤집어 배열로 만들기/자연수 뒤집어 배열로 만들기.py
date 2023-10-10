def solution(n):
    n_str = str(n)
    answer = []
    for i in range(len(n_str)-1, -1, -1):
        answer.append(int(n_str[i]))
    return answer