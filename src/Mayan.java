class Mayan extends Langauge {

    Mayan(String languageName, int speakers){
        super(languageName, speakers, "Central America", "verb-object-subject");
    }

    @Override
    public void getInfo(){
        System.out.printf("%s is spoken by %d people mainly in %s.", name, numSpeakers, regionsSpoken);

        System.out.printf("The language follows the word order: %s", wordOrder);

        System.out.printf("Fun fact: %s is an ergative language.", name);
    }
}
