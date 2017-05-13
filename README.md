# java-bank
## 1. Statement of the Work

It is a bank where Java Bank users can make withdrawals and credits. Users have a bank account here and users make transactions through this account.

## 2. Proposed Pattern

2 design patterrns are applied for solving existing problems in the project. These design patterns are Observer Design Pattern and Singleton Design Pattern.

Firstly, a user has only one bank account, and only performs operations of money through this bank account. Therefore, it is sufficient to produce only 1 object from the BankAccount class for 1 user. For this reason, the BankAccount class is defined as Singleton Class.

Finally, when the user makes a withdrawal or investment, the user is informed via SMS and e-mail. The amount of money the user trades and the amount of money in the bank make up this information. Because of this, SMS and e-mail systems that send information of transactions are considered as Observers. The BankAccount class is also considered Subject. Every transaction made in BankAccount is notified to SMSNotifier and EmailNotifier classes and these classes do the necessary processing.

## 3. Class Diagram
![javabank](https://cloud.githubusercontent.com/assets/21054424/26025924/7a619442-37fa-11e7-8182-bdcbf46d2cb8.PNG)
