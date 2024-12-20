public class Animal {
    public String bt() { 
        return "!"; 
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Platypus(); 
        Mammal m1 = new Platypus();
        System.out.print(a1.bt());
        System.out.print(a2.bt()); 
        System.out.print(m1.bt()); 
    }   
}

class Mammal extends Animal {
    public String bt() { 
        return "live"; 
    }
}

class Platypus extends Mammal {
    public String bt() { 
        return "egg"; 
    }
}
