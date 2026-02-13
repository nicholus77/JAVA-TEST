class Animal {
    void sound()
    {
        System.out.println("meruukkam  !");
    }

}



class Dog extends Animal{

    void sound()
    {

        System.out.println("Naaai  !");

    }
}





class B{
    public static void main(String[] args) {
        Animal meerukam = new Animal();
        Dog naai = new Dog ();
          

         meerukam.sound();
        naai.sound();
        

    }
    
}