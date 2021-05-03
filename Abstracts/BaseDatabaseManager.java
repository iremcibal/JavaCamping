package Abstracts;

public abstract class BaseDatabaseManager {
    public abstract void getData();
    /*Oracle,Sql gibi extend edildiği yerlerde override ederek kullanmak zorunlu
    Burada şablonu doldurmasını zorunlu kılıyoruz.
    Abstractlar asla newlenemez.
    Class'lardan farkı bu.*/

}
