/**
 * Створіть 2 класи, Animal та Cat.
 * У класі Animal ініціалізуйте 3 поля різних модифікаторів.
 * У класі Cat використовуючи рефлексію, отримайте доступ до полів класу Animal та змініть вміст кожного з полів.
 * * Завдання із зірочкою
 * Додайте модифікатори
 * Final
 * Static
 */


public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Cat cat = new Cat();
        cat.changeModifiers();

    }
}
