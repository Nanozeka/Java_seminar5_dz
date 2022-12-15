// Задача 1

// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что один человек может иметь несколько телефонов
import java.util.HashMap;
import java.util.Map;



public class task_1 {
    public static void main(String[] args) {

        // Иницилизируем HashMap
        HashMap<String, String> bookPhone = new HashMap<>();
        
        // Заполняем книгу - ключ,значение
        bookPhone.put("Сидоров Ф.И.", "431-83-46");
        bookPhone.put("Михайлов С.А.", "234-56-63");
        bookPhone.put("Петров И.Л.", "122-76-45");
        bookPhone.put("Смирнов К.А.", "223-45-38");
        bookPhone.put("Григорьев О.К.", "256-45-63, 267-43-53");
        bookPhone.put("Кабанов Т.О.", "345-88-99, 782-29-00");

        // Печатаем данные человека с одним телефоном
        System.out.println("Сидоров Ф.И.: " + bookPhone.get("Сидоров Ф.И."));

        // Печатаем данные человека с двумя телефонами
        System.out.println("Григорьев О.К.: " + bookPhone.get("Григорьев О.К."));

        // Добавляем в книгу нового человека
        addBookFone(bookPhone, "Ковальчук А.Е.", "432-55-45");

        // Печатаем его данные
        System.out.println("Ковальчук А.Е.: " + bookPhone.get("Ковальчук А.Е."));

        // Удаляем из книги человека
        deleteBookFone(bookPhone, "Сидоров Ф.И.");

        // Печатаем книгу
        System.out.println(bookPhone);
    }

    //  Метод по добавлению или изменению данных
    public static void addBookFone(Map<String, String> dict, String name, String number){
        dict.put(name, number);
    }
    // Метод по удалению данных
    public static void deleteBookFone(Map<String, String> dict, String name){
        dict.remove(name);
    }
}