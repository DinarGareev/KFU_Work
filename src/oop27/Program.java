package oop27;

public class Program {
    public static void main(String[] args) {
        System.out.println(Colors.RED.getCode());
    }
}

enum Colors {
    RED("123"),
    GREEN("456"),
    BLACK("789");

    private String code;  //приватное поле для хранения
     Colors(String code){   // так как у нас перечисление то конструктор по умолчанию имеет доступ private
        this.code = code;   // поэтому константы внутри перечисления мы можем вызывать только внутри перечисления
    }

    public String getCode() {  //методы принимают любое значение т.е public и т.д
        return code;
    }
}
