package pojo;

public class Exam {
    Integer id;
    String examName;
    String examDecript;
    String classid;
    String pubstuats;
    String browsetype;
    String publisher;

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getExamDecript() {
        return examDecript;
    }

    public void setExamDecript(String examDecript) {
        this.examDecript = examDecript;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getPubstuats() {
        return pubstuats;
    }

    public void setPubstuats(String pubstuats) {
        this.pubstuats = pubstuats;
    }

    public String getBrowsetype() {
        return browsetype;
    }

    public void setBrowsetype(String browsetype) {
        this.browsetype = browsetype;
    }
}
