public class Speak {
    public static void main(String[] args) {
        Cat Cat = new Cat();
        String say = Cat.speak("Time feed me ");
        System.out.println(say);

         Cat.eat();
        Cat.name = "Bel";
        Cat.color = "black";
        Cat.weight = 2;
        System.out.println(Cat.name);
        System.out.println(Cat.color);
        System.out.println(Cat.weight);
    }}

