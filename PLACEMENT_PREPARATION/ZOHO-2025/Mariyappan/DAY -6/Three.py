# Maximize unique candy types the sister can receive.
def distribute_candies(candies):
    return min(len(candies)//2, len(set(candies)))
# Mariyappan
