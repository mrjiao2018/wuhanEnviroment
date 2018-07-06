package temp;

import vo.TableItem;

import java.util.List;

public class TableItemManager {
    private static List<CurUser> curUsers;

    public static void add(CurUser curUser){
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
        for (CurUser c :curUsers
                ) {
            if (c.getUsername().equals(username)){
                c.store();
            }
        }
    }
}
