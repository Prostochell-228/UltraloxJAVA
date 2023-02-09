//=======ситуация=======
public class Situation {
    Situation[] direction;
    String subject,text;
    int dLevel,dRespect;
    public Situation (String subject, String text, int variants, int dlevel,int drespect) {
        this.subject=subject;
        this.text=text;
        dLevel=dlevel;
        dRespect=drespect;
        direction=new Situation[variants];
    }
}
