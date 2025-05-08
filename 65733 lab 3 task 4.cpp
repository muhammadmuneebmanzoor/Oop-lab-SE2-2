#include <iostream>
using namespace std;

class Counter {
private:
    int count;

public:
    Counter() : count(0) {}
    void display() { cout << count << endl; }
    friend void incrementByValue(Counter c);
    friend void incrementByReference(Counter &c);
    friend void incrementByPointer(Counter* c);
};

void incrementByValue(Counter c) { c.count++; }
void incrementByReference(Counter &c) { c.count++; }
void incrementByPointer(Counter* c) { c->count++; }

int main() {
    Counter obj;
    obj.display();
    incrementByValue(obj);
    obj.display();
    incrementByReference(obj);
    obj.display();
    incrementByPointer(&obj);
    obj.display();
    return 0;
}
