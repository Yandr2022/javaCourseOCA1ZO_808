package homework.lesson28;

public class Tiger {
    void eat(String food) throws InappropriateFood {
        if (!food.equalsIgnoreCase("meat")) {
            throw new InappropriateFood("Tiger doesn't eat " + food);
        } else {
            System.out.println("Tiger eats " + food);
        }
    }

    void drink(String drink) {
        if (!drink.equalsIgnoreCase("water")) {
            throw new InappropriateDrink("Tiger doesn't drinks " + drink);
        } else {
            System.out.println("Tiger drinks " + drink);
        }
    }

}
class Demo{
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.drink("water");
        try {
            tiger.eat("meat");
            try {
                tiger.drink("beer");
            }catch (InappropriateDrink e){
                System.err.println(e.getMessage());
            }
        } catch (InappropriateFood e) {
            System.err.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Inner finally block");
        }
    }
}
