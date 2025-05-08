#include <iostream>
#include <string>

using namespace std;

class Product {
public:
    string name;
    double price;
    int quantity;

    Product(string name, double price, int quantity) {
        this->name = name;
        this->price = price;
        this->quantity = quantity;
    }

    double getTotalValue() const {
        return price * quantity;
    }
};

class Inventory {
private:
    Product* products[5];

public:
    Inventory() {
        for (int i = 0; i < 5; i++) {
            products[i] = nullptr;
        }
    }

    void addProduct(int index, Product* product) {
        if (index >= 0 && index < 5) {
            products[index] = product;
        }
    }

    void displayProductsAboveThreshold(double threshold) const {
        cout << "\nProducts with total value above $" << threshold << ":\n";
        bool found = false;
        for (int i = 0; i < 5; i++) {
            if (products[i] != nullptr && products[i]->getTotalValue() > threshold) {
                cout << "Product Name: " << products[i]->name << ", Price: $" << products[i]->price
                     << ", Quantity: " << products[i]->quantity
                     << ", Total Value: $" << products[i]->getTotalValue() << endl;
                found = true;
            }
        }
        if (!found) {
            cout << "No products found with a total value above $" << threshold << endl;
        }
    }
};

int main() {
    Inventory inventory;

    for (int i = 0; i < 5; i++) {
        string name;
        double price;
        int quantity;

        cout << "Enter details for product " << (i + 1) << ":\n";
        cout << "Name: ";
        cin >> ws;
        getline(cin, name);
        cout << "Price: $";
        cin >> price;
        cout << "Quantity: ";
        cin >> quantity;

        Product* product = new Product(name, price, quantity);
        inventory.addProduct(i, product);
    }

    inventory.displayProductsAboveThreshold(500.0);

    return 0;
}