import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
A interface Comparable em Java é usada para definir a ordem natural dos objetos de uma classe. 
Ela é parte do pacote java.lang e contém um único método, compareTo, que precisa ser implementado pela classe que a utiliza. 
Esse método é usado para comparar o objeto atual com o objeto especificado para determinar sua ordem. 

Exercício - Como implementar a interface Comparable em uma classe Person.
*/

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implementando o método compareTo
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) throws Exception {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Ordenar a lista de pessoas por idade em ordem crescente
        Collections.sort(people);

        // Exibir a lista ordenada
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
