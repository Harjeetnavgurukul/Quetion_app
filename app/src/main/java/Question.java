
public class Question {
    class Questions{

    public String mradio[] = {
            "Where is the international court of justic headquartered ?",
            "Where is the international court of justic headquartered",
            "Where is the international court of justic headquartered ?",
            "Where is the international court of justic headquartered ?",
            "Where is the international court of justic headquartered ?",
            "Where is the international court of justic headquartered ?",
            "Where is the international court of justic headquartered ?",
            "Where is the international court of justic headquartered ?",
            "Where is the international court of justic headquartered ?",
            "Where is the international court of justic headquartered ?",

    };

    private String mChoices[] [] = {
            {"Geneva,Switzerland", "The Hague, Netherland", "Vienna, Austria", "Paris, France"},
            {"Geneva,Switzerland", "The Hague, Netherland", "Vienna, Austria", "Paris, France"},
            {"Geneva,Switzerland", "The Hague, Netherland", "Vienna, Austria", "Paris, France"},
            {"Geneva,Switzerland", "The Hague, Netherland", "Vienna, Austria", "Paris, France"},
            {"Geneva,Switzerland", "The Hague, Netherland", "Vienna, Austria", "Paris, France"},
            {"Geneva,Switzerland", "The Hague, Netherland", "Vienna, Austria", "Paris, France"},
            {"Geneva,Switzerland", "The Hague, Netherland", "Vienna, Austria", "Paris, France"},
            {"Geneva,Switzerland", "The Hague, Netherland", "Vienna, Austria", "Paris, France"},
            {"Geneva,Switzerland", "The Hague, Netherland", "Vienna, Austria", "Paris, France"},
            {"Geneva,Switzerland", "The Hague, Netherland", "Vienna, Austria", "Paris, France"},


    };

    private String mCorrectAnswer[] =  {"Geneva,Switzerland", "The Hague, Netherland", "Vienna, Austria", "Paris, France"};

    public String getChoice1 (int a){
        String choice = mChoices[a] [0];
        return choice;
    }

    public String getChoice2 (int a){
        String choice = mChoices[a] [1];
        return choice;
    }

    public String getChoice3 (int a){
        String choice = mChoices[a] [2];
        return choice;
    }

    public String getChoice4 (int a){
        String choice = mChoices[a] [3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }

}
