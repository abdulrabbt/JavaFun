public class Project {
    private String name;
    private String description;

    public String elevatorPitch(){
        return("Name: "+this.name+" Description: "+this.description);
    };

    public Project() {
        this.name = "";
        this.description = "";
    }

    public Project(String name) {
        this.name = name;
        this.description = "";
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setData(String name, String description){
        this.name = name;
        this.description = description;
    };

    public String getData(){
        return("Name: "+this.name+" Description: "+this.description);
    }
}
