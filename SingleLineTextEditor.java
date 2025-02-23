import java.util.Scanner;
import java.util.Stack;

class Node {
    char data;
    Node prev;
    Node next;

    Node(char data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class SingleLineTextEditor {
    private Node head;
    private Node cursor;
    private Stack<String> undoStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();

    public SingleLineTextEditor() {
        head = null;
        cursor = new Node('|');
        head = cursor;
    }

    public String text2String() {
        Node curr = head;
        StringBuilder str = new StringBuilder();
        while (curr != null) {
            str.append(curr.data);
            curr = curr.next;
        }
        return str.toString();
    }

    public void string2Text(String str) {
        head = null;
        Node prevNode = null;
        cursor = null;
        boolean cursorPresent = false;

        for (char c : str.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = newNode;
            } else {
                prevNode.next = newNode;
                newNode.prev = prevNode;
            }
            prevNode = newNode;

            if (c == '|') {
                cursor = newNode;
                cursorPresent = true;
            }
        }

        if (!cursorPresent) {
            Node cursorNode = new Node('|');
            if (prevNode != null) {
                prevNode.next = cursorNode;
                cursorNode.prev = prevNode;
            } else {
                head = cursorNode;
            }
            cursor = cursorNode;
        }
    }

    public void saveState() {
        undoStack.push(text2String());
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(text2String());
            string2Text(undoStack.pop());
        }
        displayText();
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(text2String());
            string2Text(redoStack.pop());
        }
        displayText();
    }

    public void insert(String text) {
        saveState();
        for (char c : text.toCharArray()) {
            Node newNode = new Node(c);
            newNode.prev = cursor.prev;
            newNode.next = cursor;
            if (newNode.prev != null) {
                newNode.prev.next = newNode;
            } else {
                head = newNode;
            }
            cursor.prev = newNode;
        }
        displayText();
    }

    public void delete() {
        saveState();
        if (cursor.prev != null) {
            cursor.prev = cursor.prev.prev;
            if (cursor.prev != null) {
                cursor.prev.next = cursor;
            } else {
                head = cursor;
            }
        }
        displayText();
    }

    public void moveLeft() {
        if (cursor.prev != null) {
            cursor.data = cursor.prev.data;
            cursor = cursor.prev;
            cursor.data = '|';
        }
        displayText();
    }

    public void moveRight() {
        if (cursor.next != null) {
            cursor.data = cursor.next.data;
            cursor = cursor.next;
            cursor.data = '|';
        }
        displayText();
    }

    public void displayText() {
        System.out.println("------------------------ Text Editor Start ------------------------");
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
        System.out.println("\n------------------------- Text Editor End -------------------------");
    }

    public static void main(String[] args) {
        SingleLineTextEditor editor = new SingleLineTextEditor();
        Scanner scanner = new Scanner(System.in);
        char command;

        while (true) {
            System.out.println("Enter command (I: Insert, D: Delete, L: Left, R: Right, U: Undo, Y: Redo): ");
            command = scanner.nextLine().charAt(0);

            switch (command) {
                case 'I':
                    System.out.println("Enter text to insert: ");
                    String text = scanner.nextLine();
                    editor.insert(text);
                    break;
                case 'D':
                    editor.delete();
                    break;
                case 'L':
                    editor.moveLeft();
                    break;
                case 'R':
                    editor.moveRight();
                    break;
                case 'U':
                    editor.undo();
                    break;
                case 'Y':
                    editor.redo();
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }
}
 
