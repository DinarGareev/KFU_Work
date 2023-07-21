package oop26;
//вернем массив всех констат нашего перечисления
public class Program {
    public static void main(String[] args) {
        Type[] types = Type.values();             //Type выступает в роли типа данных //values() - возвращает массив всех наших констант из перечисления
        for (Type s : types) {
            System.out.println(s);
        }
        System.out.println("-------------------------");

        for (int i = 0; i < types.length; i++) {
            System.out.println(types[i]);
        }
    }
}

 enum Type{
    SCIENCE,
    PHANTASY,
    TECHNICAL
}
