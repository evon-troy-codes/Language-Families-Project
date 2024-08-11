public class Langauge {

    // Class Variables

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    // Constructor

    public Langauge(String langName, int speakers, String regions, String wdOrder){
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = wdOrder;
    }

    public void getInfo(){
        System.out.printf("%s is spoken by %d people mainly in %s. The language follows the word order: %s%n", name, numSpeakers, regionsSpoken, wordOrder);
    }

    public static void main(String[] args) {

        Langauge english = new Langauge("English", 100, "North America", "subject-verb-object.");

        Langauge mayan = new Langauge("Ki'che'",2330000,"Central America","verb-object-subject");

        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
        mandarin.getInfo();

        SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
        burmese.getInfo();

        english.getInfo();
        mayan.getInfo();
        mandarin.getInfo();
        burmese.getInfo();

    }
}
