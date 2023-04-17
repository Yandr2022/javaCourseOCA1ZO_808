package lesson16;

public class Demo1 {
    public static void main(String[] args) {
        String rubai = "Чтоб мудро жизнь прожить, знать надобно не мало, Два важных правила запомни для начала: " +
                "Ты лучше голодай, чем что попало есть, И лучше будь один, чем вместе с кем попало.";
        String upperRubai = rubai.toUpperCase();
        char c;
        char c1;
        for (int i = 0; i < rubai.length(); i++) {
            c = rubai.toCharArray()[i];
            c1 = upperRubai.toCharArray()[i];
            if (c == c1 && c1 != ' ' && c1 != ',' && c1 != '.' && c1 != ':') {
                System.out.println();
                System.out.print(c);
                continue;
            }
            System.out.print(c);
        }

    }
}
