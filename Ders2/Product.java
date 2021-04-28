package Ders2;

public class Product {
    //attribute-field
    private int id;
    private String name;
    private String kod;

    //setter-Hem okunabilir hem de kullanıcı tarafından yazılabilir.
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //getter-Sadece okunabilir olmasını istiyorsak
    public String getKod() {
        return this.name.substring(0,1) + id;
    }


}
