#prompt user to enter an integer between number one to number seven
#if  n is number one 
#display monday
#if n is number two
#display tuesday
#if n is number three 
#display wednesday
#if n is number four
#display thursday
#if n is number five
#display friday
#if n is number six
#display saturday
#if n is number seven
#display saturday
#else display invalid day




#n = int(input("Enter an integer between 1 to 7: "))

#if n == 1:
    #print("Monday")
#elif n == 2:
    #print("Tuesday")
#elif n == 3:
    #print("Wednesday")
#elif n == 4:
    #print("Thursday")
#elif n == 5:
    #print("Friday")
#elif n == 6:
    #print("Saturday")
#elif n == 7:
    #print("Sunday")
#else: 
	#print("Invalid day")
	
	
n = int(input("Enter an integer between 1 to 7: "))

match n:
    case 1:
        print("Monday")
    case 2:
        print("Tuesday")
    case 3:
        print("Wednesday")
    case 4:
        print("Thursday")
    case 5:
        print("Friday")
    case 6:
        print("Saturday")
    case 7:
        print("Sunday")
    case _: 
	    print("Invalid day")
	    
	
