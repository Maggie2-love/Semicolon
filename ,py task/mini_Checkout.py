name = input("Enter your name: ")
for number in range(2):

   

    product_name = input("Enter the product you got: ")

    quantity = int(input("Enter the quantity of  product: " ))

    price = float(input("Enter the price of product: " ))

    add_product = input("Add another product. yes/no: ")
    
    if add_product == "no":

        total_amount = quantity * price
        print("Your total amount is:" , total_amount)



