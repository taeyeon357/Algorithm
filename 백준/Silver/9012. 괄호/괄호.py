num = int(input())

for i in range(num):
    data = list(input())

    sum = 0
    for d in data:
        if d=='(':
            sum+=1
        elif d ==')':
            sum-=1
        
        if sum<0:
            print("NO")
            break

    if sum>0:
        print("NO")
    elif sum==0:
        print("YES")
  