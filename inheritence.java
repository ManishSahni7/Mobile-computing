class Animal {
string name;
void eat () {
system.out.println(name + " is eating ");
}
}
class Dog extend Animal{
void Bark () {
system.out.println(name + " ism barking");
}
}

public class Main(string []args) {
Dog myDog = new Dog();
myDog.name = "buddy";
myDog.eat();
myDog.bark();
}
}
