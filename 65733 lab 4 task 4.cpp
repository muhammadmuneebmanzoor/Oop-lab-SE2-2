#include <iostream>
using namespace std;

class Computer {
public:
    int word_size, memory_size, storage_size, speed;

    Computer(int w, int m, int s, int sp) : word_size(w), memory_size(m), storage_size(s), speed(sp) {}

    void display() {
        cout << "Computer: " << word_size << "-bit, " << memory_size << "MB RAM, "
             << storage_size << "MB Storage, " << speed << "MHz\n";
    }

    void setSpecs(int m, int sp) {
        memory_size = m;
        speed = sp;
    }

    void setSpecs(int m, int sp, int s) {
        memory_size = m;
        speed = sp;
        storage_size = s;
    }
};

class Laptop : public Computer {
public:
    double length, width, height, weight;

    Laptop(int w, int m, int s, int sp, double l, double wd, double h, double wt)
        : Computer(w, m, s, sp), length(l), width(wd), height(h), weight(wt) {}

    void display() {
        Computer::display();
        cout << "Laptop: " << length << "cm x " << width << "cm x " << height
             << "cm, " << weight << "kg\n";
    }
};

int main() {
    Laptop myLaptop(64, 8192, 512000, 3200, 36, 24, 2, 2.3);
    myLaptop.display();

    cout << "\nUpdating laptop specs...\n";
    myLaptop.setSpecs(16384, 3600, 1024000);
    myLaptop.display();

    return 0;
}
