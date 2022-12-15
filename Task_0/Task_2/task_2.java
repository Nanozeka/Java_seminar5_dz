// Задача 2:
// Пусть дан список сотрудников:

//     Иван Иванов
//     Светлана Петрова
//     Кристина Белова
//     Анна Мусина
//     Анна Крутова
//     Иван Юрин
//     Петр Лыков
//     Павел Чернов
//     Петр Чернышов
//     Мария Федорова
//     Марина Светлова
//     Мария Савина
//     Мария Рыкова
//     Марина Лугова
//     Анна Владимирова
//     Иван Мечников
//     Петр Петин
//     Иван Ежов

//     Написать программу, которая найдет и выведет повторяющиеся имена
//      с количеством повторений. Отсортировать по убыванию популярности.

    import java.util.*;

    public class task_2 {
        public static void main(String[] args) {

            // Создаем строку с фамилией и именем        
            String namesString = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова,Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";

            // Распарсиваем имена и фамилии людей на отдельные блоки
            String[] namesArray = namesString.split(", ");

            // Иницилизируем HashMap
            HashMap<String, Integer> names = new HashMap<String, Integer>();
    
            for (String name : namesArray) {

                        // Разделяем имя и фамилию на 2 элемента 
                        String[] FullName = name.split(" ");

                        // Если имя совпадает с 0 индексом(с таким же именем),
                        // то счетчик значений увеличивается
                        if (names.containsKey(FullName[0])) {
                            names.put(FullName[0], names.get(FullName[0]) + 1);
                        } else {

                            // Иначе добавляется новое имя со значением 1
                            names.put(FullName[0], 1);
                        }
                    }

            // Создаем новый список(имя + значение)
            List<Integer> positions = new ArrayList<Integer>(names.values());

            // Сортируем по убыванию при помощи коллекции reverseOrder
            positions.sort(Collections.reverseOrder());
    
            HashMap<String, Integer> sortedNames = new LinkedHashMap<String, Integer>();
            for (int position : positions)
            {

                // для сортировки в коллекции смотрим если позиция ключа(имени)
                // совпадает с  найденым ключем(именем) то имя добавляем к позиции ключа
                for (String name : names.keySet()){
                    if (position == names.get(name)) {
                        sortedNames.put(name, position);
                     }
                }
            }
            // Печатаем отсортированный список
                System.out.println(sortedNames);      
        }
    }
    