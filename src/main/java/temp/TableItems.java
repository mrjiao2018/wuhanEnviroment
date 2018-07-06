package temp;

import vo.TableItem;

import java.util.List;

public class TableItems {
    private List<TableItem> tableItems;

    public void store(){
        for (TableItem table:tableItems
             ) {
            table.store();
        }
    }

    public void add(TableItem tableItem){
        tableItems.add(tableItem);
    }
}
