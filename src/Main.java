public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone("Ivan", 7.70032123, "D4", 1.67);
        System.out.println(p1.all);
        System.out.println("Звонит: " + p1.recieveCall(p1.ownerName));
        System.out.println("Его номер: " + p1.getNumber());
        Phone p2 = new Phone("Olav", 7.70041235, "L4", 1.67);
        System.out.println(p2.all);
        System.out.println("Звонит: " + p2.recieveCall(p2.ownerName));
        System.out.println("Его номер: " + p2.getNumber());
        Phone p3 = new Phone("Pedro", 7.70042344, "D24", 1.67);
        System.out.println(p3.all);
        System.out.println("Звонит: " + p3.recieveCall(p3.ownerName));
        System.out.println("Его номер: " + p3.getNumber());
        Phone p4 = new Phone("Huliano", 7.70064386, "U3", 1.67);
        System.out.println(p4.all);
        System.out.println("Звонит: " + p4.recieveCall(p4.ownerName));
        System.out.println("Его номер: " + p4.getNumber());
        Phone p5 = new Phone("Lang", 7.70098954, "I4", 1.67);
        System.out.println(p5.all);
        System.out.println("Звонит: " + p5.recieveCall(p5.ownerName));
        System.out.println("Его номер: " + p5.getNumber());

        Phone1 p6 = new Phone1(8.23112123, "Y3");
        Phone2 p7 = new Phone2();
        System.out.println(p3.recieveCall(p3.getOwnerName(), p3.getNumber()));
        Phone p8 = new Phone("Jesse", 3.2123, "O32", 1.23);
        p8.sendMessage("POLLOS");
        System.out.println(p8.recieveMessage(p8.sendMessage(p8.message)));
    }
    public static class Phone{
        private double number;
        private String model;
        private String ownerName;
        private double weight;
        private String all;
        private String message;
        public Phone(double number, double weight){
            this.number = number;
            this.weight = weight;
        }
        public Phone(String ownerName, double number, String model, double weight) {
            this(number, weight);
            this.model = model;
            this.ownerName = ownerName;
            this.all = "Номер: " + number + ", " + "Модель: " + model + ", " + "Владелец: " + ownerName + ", " + "Масса телефона: " + weight;
            Object ran1 = model;
            if(ran1 instanceof String){ System.out.println("Модель это String");}
            Object ran2 = number;
            if(ran2 instanceof Double){System.out.println("Номер это double");}
            Object ran3 = ownerName;
            if(ran3 instanceof String){System.out.println("Владелец это String");}
            Object ran4 = weight;
            if(ran4 instanceof Double){System.out.println("Вес это double");}
        }
        public String recieveCall(String ownerName){
            return ownerName;
        }
        public double getNumber() {
            return number;
        }
        public void setNumber(double number) {
            this.number = number;
        }
        public String getOwnerName() {
            return ownerName;
        }
        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }
        public String recieveCall(String ownerName, double number){
            return getOwnerName() + " " + getNumber();
        }
        public String sendMessage(String message){
            this.message = message;
            return message;
        }
        public String recieveMessage(String message){
            return sendMessage(message);
        }
    }

    public static class Phone1{
        private double number;
        private String model;

        public Phone1(double number, String model) {
            this.number = number;
            this.model = model;
        }
    }
    public static class Phone2{
    }
}