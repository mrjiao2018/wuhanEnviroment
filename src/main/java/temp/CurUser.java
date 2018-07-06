package temp;

import vo.TableItem;

public class CurUser {
    private String username;
    private String position;
    private String type;
    private TableItems tableItems;

    public CurUser(String username, String position, String type) {
        this.username = username;
        this.position = position;
        this.type = type;
        tableItems=new TableItems();
    }

    public void add(TableItem tableItem){
        tableItems.add(tableItem);
    }

    public void store(){
        tableItems.store();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
