class GymMembership {
    private String memberName;
    private int membershipType; // 1 Денний абонемент  2 Місячний абонемент  3 Річний абонемент
    private double price;
    private String typeAbonement;

    public GymMembership(String memberName, int membershipType) {
        this.memberName = memberName;
        this.membershipType = membershipType;

        switch (membershipType) {
            case 1:
                price = 200.0;
                typeAbonement = "денного";
                break;
            case 2:
                price = 1400.0;
                typeAbonement = "місячного";
                break;
            case 3:
                price = 11000.0;
                typeAbonement = "річного";
                break;
            default:
                price = 0.0;
        }
    }

                                                  //  Перевизначення методу для обчислення ціни абонементу
    public void calculatePrice(double discount) {
        price = (price/100)*(100-discount);
        System.out.println("Клієнт " + memberName + " отримав знижку " + discount + "%.");
        System.out.println("Загальна ціна "+ typeAbonement +" абонементу: ₴ " + price);
    }

                                                      // Виклик методу, що викликає метод із іншого класу
    public void purchaseServices(GymServices services) {
        services.showServices();
        System.out.println("Клієнт " + memberName + " купив додаткові послуги.");
    }
}

