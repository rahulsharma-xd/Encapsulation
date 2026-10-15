# 🏦 Bank Account Management System | Java OOP

A simple, menu-driven Bank Account Management System built using **Java** to demonstrate the concept of **Encapsulation** in Object-Oriented Programming (OOP).

This project allows users to enter their account details and perform basic banking operations through a console-based user input system.

## 🚀 Features

- 👤 Accept account holder name and account number from the user
- 💰 Enter an opening balance
- ➕ Deposit money into the account
- ➖ Withdraw money from the account
- 📊 Check the current account balance
- 🧾 Display account details
- ✅ Validate deposit and withdrawal amounts
- 🚫 Prevent withdrawals when the balance is insufficient
- 🔄 Interactive menu that runs until the user exits

## 🛠️ Technologies Used

- **Language:** Java
- **Concepts:** Encapsulation, Classes & Objects, Constructors, Methods, Conditional Statements, Loops, Switch Statements
- **Input Handling:** Java Scanner Class
- **IDE:** IntelliJ IDEA

## 🧠 OOP Concept: Encapsulation

Encapsulation is the process of wrapping data and methods into a single unit and restricting direct access to an object's data.

In this project, encapsulation is implemented by:

- Declaring account details and balance as `private` variables.
- Using public methods to perform deposit and withdrawal operations.
- Providing a getter method to access the current balance.
- Validating input before modifying the account balance.

This helps protect account data and maintain controlled access to the balance.

## 💻 How to Run

1. Clone this repository:

   ```bash
   git clone https://github.com/rahulsharma-xd/Encapsulation.git
   ```

2. Open the project in IntelliJ IDEA or another Java IDE.

3. Make sure the Java JDK is installed.

4. Open `Main.java` inside the `Bank_Account/src` folder.

5. Run the `Main` class and follow the console instructions.

## 📸 Sample Output

```text
Enter account holder name: Rahul
Enter account number: 12345
Enter opening balance: 20000

===== BANK MENU =====
1. Deposit
2. Withdraw
3. Check Balance
4. Display Account Details
5. Exit

Enter your choice: 1
Enter deposit amount: 5000
Deposit successful!

Enter your choice: 3
Current Balance: 25000.0
```

## 🎯 Learning Objectives

- Understand encapsulation in Java.
- Learn how to use private variables and public methods.
- Take user input using the Scanner class.
- Implement basic banking operations.
- Apply validation and conditional logic.
- Build a menu-driven console application.

## 🔮 Future Improvements

- Multiple bank accounts
- Account number-based login
- PIN-based authentication
- Transaction history
- Database integration using MySQL
- Spring Boot backend and REST APIs

## 👨‍💻 Author

**Rahul Sharma**

GitHub: [@rahulsharma-xd](https://github.com/rahulsharma-xd)

---

⭐ If you find this project useful, consider giving this repository a star!

*This project is created for learning and practicing Java OOP concepts. It is not intended for real banking transactions.*
