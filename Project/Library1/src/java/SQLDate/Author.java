package SQLDate;

public class Author {
    
    private String fio;
    private long id;
    
    public Author(){}
    
    public Author(String fio){
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
}
