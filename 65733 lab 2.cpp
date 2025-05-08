#include <iostream>
using namespace std;

class AverageCalculator {
private:
    float numbers[100];
    int size;

public:

    AverageCalculator(int s) {
        size = s;
    }


    void setNumbers() {
        cout << "Enter " << size << " float numbers: ";
        for (int i = 0; i < size; i++) {
            cin >> numbers[i];
        }
    }


    float getSum() {
        float sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }
        return sum;
    }


    void displayAverage() {
        cout << "Average: " << getSum() / size << endl;
    }


    void displayNumbers() {
        cout << "Numbers entered: ";
        for (int i = 0; i < size; i++) {
            cout << numbers[i] << " ";
        }
        cout << endl;
    }
};


int main() {
    int n;
    cout << "Enter the number of values: ";
    cin >> n;

    AverageCalculator avgCalc(n);

    avgCalc.setNumbers();
    avgCalc.displayNumbers();
    avgCalc.displayAverage();

    return 0;
}
