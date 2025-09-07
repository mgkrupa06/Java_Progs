package stackperson;

import java.util.*;

public class TicketCounterStack {

    public static Person readPerson(Scanner sc) {
        sc.nextLine(); 
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter gender (MALE, FEMALE, OTHER): ");
        sc.nextLine(); 
        String genderStr = sc.nextLine().toUpperCase();
        Gender gender;
        try {
            gender = Gender.valueOf(genderStr);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid gender");
            gender = Gender.OTHER;
        }

        return new Person(name, age, gender);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = null;

        System.out.println("Choose initialization:");
        System.out.println("1. Empty stack with size");
        System.out.println("2. Stack initialized with array of Persons");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter size: ");
            int size = sc.nextInt();
            st = new Stack(size);
        } else if (choice == 2) {
            System.out.print("Enter number of Persons: ");
            int n = sc.nextInt();
            Person arr[] = new Person[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Enter details for Person " + (i + 1) + ":");
                arr[i] = readPerson(sc);
            }
            st = new Stack(arr);
        } else {
            System.out.println("Invalid choice");
            return;
        }

        int option;
        do {
            System.out.println("\n Menu ");
            System.out.println("1. Push one Person");
            System.out.println("2. Push two Persons");
            System.out.println("3. Pop one Person");
            System.out.println("4. Pop multiple Persons");
            System.out.println("5. Display all Persons");
            System.out.println("6. Display top n Persons");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();

            switch(option) {
                case 1:
                    System.out.println("Enter details for Person:");
                    Person p1 = readPerson(sc);
                    st.push(p1);
                    break;

                case 2:
                    System.out.println("Enter details for first Person:");
                    Person p2a = readPerson(sc);
                    System.out.println("Enter details for second Person:");
                    Person p2b = readPerson(sc);
                    st.push(p2a, p2b);
                    break;

                case 3:
                    Person popped = st.pop();
                    if (popped != null) {
                        System.out.println("Popped Person:");
                        popped.displayPerson();
                    }
                    break;

                case 4:
                    System.out.print("Enter number of Persons to pop: ");
                    int n = sc.nextInt();
                    st.pop(n);
                    break;

                case 5:
                    st.display();
                    break;

                case 6:
                    System.out.print("Enter number of top Persons: ");
                    int topN = sc.nextInt();
                    st.display(topN);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while(option != 7);
    }
}
