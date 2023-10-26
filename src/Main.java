public class Main {
    public static void main(String[] args) {
        GymMembership member1 = new GymMembership("Анна", 2);
        GymMembership member2 = new GymMembership("Петро", 3);

                                                                // Виклик методу для обчислення ціни абонементу зі знижкою
        member1.calculatePrice(15.5);

                                                                //Виклик методу, що викликає метод із іншого класу
        GymServices additionalServices = new GymServices();
        member2.purchaseServices(additionalServices);
    }
}