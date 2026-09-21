print("MESSAGES")
print("1. Write messages")
print("2. Inbox")
print("3. Outbox")
print("4. Exit")

choice = int(input("Select: "))

if choice == 1:
    print("\nWRITE MESSAGES")
    message = input("Write your message: ")

    print("\nOPTIONS")
    print("1. Send")
    print("2. Template")
    print("3. Insert smiley")
    print("4. Send by set")
    print("5. Save")
    print("6. Erase")
    print("7. Exit")

    option = int(input("Select: "))

    if option == 1:
        phone_number = input("Enter recipient phone number: ")
        print("Message sent to " + phone_number)

    elif option == 2:
        print("Template selected.")

    elif option == 3:
        print("Insert smiley selected.")

    elif option == 4:
        print("Send by set selected.")

    elif option == 5:
        print("Message saved.")

    elif option == 6:
        print("Message erased.")

    elif option == 7:
        print("Exit.")

    else:
        print("Invalid option.")


elif choice == 2:
    print("\nINBOX")
    print("1. Read message")
    print("2. Exit")

    inbox_choice = int(input("Select: "))

    if inbox_choice == 1:
        print("\nREAD MESSAGE")
        print("Hello! This is a message.")

        print("\nOPTIONS")
        print("1. Erase")
        print("2. Reply")
        print("3. Chat")
        print("4. Edit")
        print("5. Use number")
        print("6. Forward")
        print("7. Details")

        inbox_option = int(input("Select: "))

        if inbox_option == 1:
            print("Message erased.")

        elif inbox_option == 2:
            print("Reply selected.")

        elif inbox_option == 3:
            print("Chat selected.")

        elif inbox_option == 4:
            print("Edit selected.")

        elif inbox_option == 5:
            print("Use number selected.")

        elif inbox_option == 6:
            print("Forward selected.")

        elif inbox_option == 7:
            print("Details selected.")

        else:
            print("Invalid option.")

    elif inbox_choice == 2:
        print("Exit.")

    else:
        print("Invalid option.")


elif choice == 3:
    print("\nOUTBOX")
    print("1. Read saved message")
    print("2. Exit")

    outbox_choice = int(input("Select: "))

    if outbox_choice == 1:
        print("\nSAVED MESSAGE")
        print("This is a saved message.")

        print("\nOPTIONS")
        print("1. Erase")
        print("2. Edit")
        print("3. Use number")
        print("4. Forward")

        outbox_option = int(input("Select: "))

        if outbox_option == 1:
            print("Message erased.")

        elif outbox_option == 2:
            print("Edit selected.")

        elif outbox_option == 3:
            print("Use number selected.")

        elif outbox_option == 4:
            print("Forward selected.")

        else:
            print("Invalid option.")

    elif outbox_choice == 2:
        print("Exit.")

    else:
        print("Invalid option.")


elif choice == 4:
    print("Exiting Messages.")

else:
    print("Invalid choice.")
