class Pet {
        private String name;
        public String getName( ) {
        return name;
        }
        public void setName(String petName) {
        name = petName;
        }
        public String speak( ) {
        return "I'm your cuddly little pet.";
        }
        }
        class Cat extends Pet {
        public String speak( ) {
        return "Don't give me orders.\n" + "I speak only when i want to";
        }
        }
        class Dog extends Pet {
            public String fetch( ) {
            return "Yes, master. Fetch I will.";
            }
            }
            public class RunPetDog{
            public static void main(String args[]){
            Pet p;
            p = new Dog( );
            System.out.println(p.speak( ));
            p = new Cat( );
            System.out.println(p.speak());
            }
        }