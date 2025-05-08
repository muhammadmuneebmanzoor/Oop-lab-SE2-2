#include <iostream>
using namespace std;

class Temperature {
private:
    double celsius;

public:
    Temperature(double c) { celsius = c; }
    double getCelsius() { return celsius; }
    void setCelsius(double c) { celsius = c; }
    double getFahrenheit() { return (celsius * 9 / 5) + 32; }
    void setFahrenheit(double f) { celsius = (f - 32) * 5 / 9; }
};

int main() {
    Temperature temp(0);
    cout << "Celsius: " << temp.getCelsius() << " | Fahrenheit: " << temp.getFahrenheit() << endl;

    temp.setFahrenheit(100);
    cout << "Fahrenheit: 100 | Celsius: " << temp.getCelsius() << endl;

    temp.setCelsius(37);
    cout << "Celsius: 37 | Fahrenheit: " << temp.getFahrenheit() << endl;

    return 0;
}
