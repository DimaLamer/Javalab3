class Ukranian extends Person{

    public Ukranian() {
       super();
    }

    public Ukranian(String name, String country,String language) {
        super(name,country,language);
    }

    public void PrintCountryName() {
        System.out.printf("Ім'я: %s \t Країна: %s \n", super.getName(), super.getCountry());
    }
    public void Speak() {
        System.out.println("Ця людина розмовляє українською");
    }
    public void sayHello(){
        System.out.println("Слава Україні!");
    }
    public void sayHelloBack(){
        System.out.println("Героям слава!");
    }

}
