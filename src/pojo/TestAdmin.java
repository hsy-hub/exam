package pojo;

public class TestAdmin {
    Integer id;
    String examName;
    String publisher;
    String pubstuats;
    String browsetype;
    String publicTime;
    Exam exam;

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
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

    public String getPublicTime() {
        return publicTime;
    }

    public void setPublicTime(String publicTime) {
        this.publicTime = publicTime;
    }
}
