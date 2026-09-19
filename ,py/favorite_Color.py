#Set favorite_color = "blue"
#Repeat three times
#Prompt user to input a color
#If color is favorite_color then
#Print Correct!
#Else if color is green then 
#Print close!
#Else Print wrong!





favorite_color = "blue"

for number in range(3):
    color = input("Guess the color: ")

    if color == favorite_color:
        print("Correct!")
        break
    else:
        if color == "green":
            print("Close!")
        else:
            print("Wrong!")
