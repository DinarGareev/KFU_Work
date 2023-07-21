package Enum;

public enum ProcessType {
    BIT32("Windows"){
        public String Bos(){
            return "No win";
        }
    },
    BIT64("Linux"){
        public String Bos(){
            return "No lin";
        }
    };

    private String name;

    public String getName(String name) {
        return name;
    }

    public abstract String Bos();
     ProcessType(String name){
        this.name = name;
    }
}
