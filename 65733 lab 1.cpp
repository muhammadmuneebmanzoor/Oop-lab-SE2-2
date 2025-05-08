#include <iostream>

using namespace std;

void Menu() {
    cout << "1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Power\n6. Exit\n";
}

int Addition(int a, int b) {
    return a + b;
}

int Subtraction(int a, int b) {
    return a - b;
}

int Multiplication(int a, int b) {
    return a * b;
}

int Division(int a, int b) {
    if (b == 0) {
        cout << "Error! Division by zero.\n";
        return 0;
    }
  
}

int Power(int a, int b) {
    int result = 1;
    for (int i = 0; i < b; i++) {
        result *= a;
    }
    return result;
}

int main() {
    int choice, num1, num2;
    
    while (true) {
        Menu();
        cout << "Enter choice (1-6): ";
        cin >> choice;

        if (choice == 6) break;

        cout << "Enter first number: ";
        cin >> num1;

        if (choice == 5) {
            cout << "Enter power: ";
            cin >> num2;
            cout << "Result: " << Power(num1, num2) << endl;
        } else {
            cout << "Enter second number: ";
            cin >> num2;

            if (choice == 1) cout << "Result: " << Addition(num1, num2) << endl;
            else if (choice == 2) cout << "Result: " << Subtraction(num1, num2) << endl;
            else if (choice == 3) cout << "Result: " << Multiplication(num1, num2) << endl;
            else if (choice == 4) cout << "Result: " << Division(num1, num2) << endl;
        }
    }
    
    return 0;
}

