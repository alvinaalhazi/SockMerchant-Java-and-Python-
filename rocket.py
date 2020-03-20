n=int(input())
l=[]
for i in range(0,n):
    l.append(int(input()))
v=-1
t=0
f = [None] *n
for i in range(0,n):
    c=1
    for j in range(i+1,n):
        if(l[i]==l[j]):
            c+=1
            f[j]=v
    if(f[i]!=v):
        f[i]=c
for i in range(0,len(f)):
    if(f[i]!=v):
        t=t+f[i]//2
print(t)
