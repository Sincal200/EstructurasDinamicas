import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertAtHead("Apple");
        dll.insertAtHead("Banana");
        dll.insertAtHead("Cherry");
        dll.insertAtHead("Grape");

        int option;
        do {
            //Menu
            System.out.println("1. Isertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Recorrer hacia adelante");
            System.out.println("4. Recorrer hacia atras");
            System.out.println("5. Mostrar tamanio de lista");
            System.out.println("6. Mostrar si la lista esta vacia");
            System.out.println("7. Buscar elemento por valor");
            System.out.println("8. Buscar elemento por indice");
            System.out.println("9. Borrar elemento");
            System.out.println("10. Salir");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Ingrese valor");
                    String valor = sc.next();
                    // display the linked list before inserting an item at the first position
                    System.out.print("DoublyLinkedList before inserting an item at the first position: ");
                    dll.traverseForward();

                    // insert an item at the first position
                    dll.insertAtHead(valor);

                    // display the linked list after inserting an item at the first position
                    System.out.print("DoublyLinkedList after inserting an item at the first position: ");
                    dll.traverseForward();
                    break;
                case 2:
                    System.out.println("Ingrese valor");
                    valor = sc.next();
                    // display the linked list before inserting an item at tail position
                    System.out.print("DoublyLinkedList before inserting an item at tail position: ");
                    dll.traverseForward();
                    // insert an item at the tail position
                    dll.insertAtTail(valor);

                    // display the linked list after inserting an item at the tail position
                    System.out.print("DoublyLinkedList after inserting an item at tail position: ");
                    dll.traverseForward();
                    break;
                case 3:
                    dll.traverseForward();
                    break;
                case 4:
                    dll.traverseBackward();
                    break;
                case 5:
                    System.out.println("Size of the linked list: " + dll.size());
                    break;
                case 6:
                    System.out.println("Is the linked list empty? " + dll.isEmpty());
                    break;
                case 7:
                    System.out.println("Ingrese valor a buscar");
                    valor = sc.next();
                    dll.searchByValue(valor);
                    break;
                case 8:
                    System.out.println("Ingrese índice a buscar");
                    valor = sc.next();
                    dll.searchByIndex(Integer.parseInt(valor));
                    break;
                case 9:
                    System.out.println("Ingrese índice de valor a borrar");
                    valor = sc.next();
                    dll.deleteFromPosition(Integer.parseInt(valor));
                    dll.traverseForward();
                    break;
            }
        } while (option != 6);

    }
}
