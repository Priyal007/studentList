
package studentlist;

public class Student {
    private String sname;
    private String sId; 

//comment added on github to show fetch+merge
    public Student(String sname, String sId) {
        this.sname = sname;
        this.sId = sId;
    }
    
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }
    
}
