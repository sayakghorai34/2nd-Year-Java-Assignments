# Python3 program to find nim-game winner
 
# Function to find winner of NIM-game
def findWinner(A, n):
 
    res = 0
    for i in range(n):
        res ^= A[i]
 
    # case when Alice is winner
    if (res == 0 or n % 2 == 0):
        return "player one"
 
    # when Bob is winner
    else:
        return "two"
 
# Driver code
A = [ 9,10,8,2,120 ]
n = len(A)
print("Winner = ", findWinner(A, n))