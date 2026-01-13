public class Student {
// Using private so that variables cannot be accessed or modified directly from outside the class
    private int id ;
    private String name;
    private int englishmark;
    private int mathmark;
    private int sciencemark;
    private int soscialmark;   
       public Student(int id, String name, int englishmark, int mathmark, int sciencemark, int soscialmark) {
        this.id = id;
        this.name = name;
        this.englishmark = englishmark;
        this.mathmark = mathmark;
        this.sciencemark = sciencemark;
        this.soscialmark = soscialmark;
    }

    public int getEnglishmark() { 
        return englishmark;
    }
    public void setEnglishmark(int englishmark) {
        this.englishmark = englishmark;
    }
    public int getMathmark() {
        return mathmark;
    }
    public void setMathmark(int mathmark) {
        this.mathmark = mathmark;
    }
    public int getSciencemark() {
        return sciencemark;
    }
    public void setSciencemark(int sciencemark) {
        this.sciencemark = sciencemark;
    }
    public int getSoscialmark() {
        return soscialmark;
    }
    public void setSoscialmark(int soscialmark) {
        this.soscialmark = soscialmark;
    }
    public Student(int id ,String name){
        this.id = id;
        this.name=name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    
    }
    
}
