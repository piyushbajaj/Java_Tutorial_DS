package SolidMaster.open_closed.bad.src;

/**
 * Created by mrk on 4/7/14.
 */
public class Greeter {
    String formality;

    public String greet() {
        if (this.formality == "formal") {
            return "Good evening, sir.";
        }
        else if (this.formality == "casual") {
            return "Sup bro?";
        }
        else if (this.formality == "intimate") {
            return "Hello Darling!";
        }
        else {
            return "Hello.";
        }
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.setFormality("intimate");
        System.out.println(greeter.greet());
    }
}
