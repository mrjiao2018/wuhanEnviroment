package temp;

import vo.TableItem;

import java.util.ArrayList;
import java.util.List;

public class TableItemManager {
    private static List<CurUser> curUsers;

    static {
        curUsers=new ArrayList<>();
    }
    public static void add(CurUser curUser){
        for (CurUser c :curUsers
                ) {
            if (c.getUsername().equals(curUser.getUsername())){
                curUsers.remove(c);
            }
        }
        curUsers.add(curUser);
    }

    public static void addItem(String username,TableItem tableItem){
        for (CurUser c :curUsers
                ) {
            if (c.getUsername().equals(username)){
                c.add(tableItem);
            }
        }
    }

    public static void store(String username){
        for (CurUser c :curUsers ) {
            if (c.getUsername().equals(username)){
                c.store();
                curUsers.remove(c);
            }
        }
    }

    public static String test(){
        return curUsers.get(0).getUsername();
    }
}
