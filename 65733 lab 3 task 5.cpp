#include <iostream>
using namespace std;

class BankAccount {
private:
    string accountNumber;
    double balance;

public:
    BankAccount(string accNum, double initBal) {
        accountNumber = accNum;
        balance = initBal > 0 ? initBal : 0;
    }
    double getBalance() { return balance; }
    void deposit(double amount) {
        if (amount > 0) balance += amount;
        else cout << "Invalid deposit amount." << endl;
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else cout << "Invalid withdrawal amount." << endl;
    }
};

int main() {
    BankAccount acc("123456", 1000);
    cout << "Balance: " << acc.getBalance() << endl;
    acc.deposit(500);
    cout << "Balance: " << acc.getBalance() << endl;
    acc.deposit(-100);
    acc.withdraw(300);
    cout << "Balance: " << acc.getBalance() << endl;
    acc.withdraw(1500);
    return 0;
}
