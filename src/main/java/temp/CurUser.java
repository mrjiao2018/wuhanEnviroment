package temp;

import vo.TableItem;

public class CurUser {
    private String username;
    private String position;
    private String type;
    private String year;
    private TableItems tableItems;

    public CurUser(String username,String year, String position, String type) {
        this.username = username;
        this.year=year;
        this.position = position;
        this.type = type;
        tableItems=new TableItems();
    }

    public void add(TableItem tableItem){
        tableItems.add(tableItem);
    }

    public void store(){
        System.out.println(year);
        tableItems.store(year);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
