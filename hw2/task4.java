public class task4 {
    public static void main(String[] args) {
        String str;
        while (true) {
            try {
                str = ConsoleInput.inputString("Введите строку: ");
                break;
            } catch (StringInputException e) {
                System.out.println("Строка не должна быть пустой");
                ;
            }
        }
        System.out.println("Введена строка:"+str);
    }
}