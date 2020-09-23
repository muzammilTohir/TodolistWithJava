package io.todolist.todowithjava.pojo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Listitem {
    private int id;
    private String item;
    private boolean checkingItem;
    public Listitem() {
    }
    public Listitem(int id,String item, boolean doneItem) {
        this.id = id;
        this.item = item;
        this.checkingItem = doneItem;
    }
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public boolean getCheckingItem() {
        return checkingItem;
    }

    public void setCheckingItem(boolean doneItem) {
        this.checkingItem = doneItem;
    }

    @Override
    public String toString() {
        return "Listitem{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", doneItem=" + checkingItem +
                '}';
    }
}
