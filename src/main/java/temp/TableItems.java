package temp;

import vo.TableItem;

import java.util.ArrayList;
import java.util.List;

public class TableItems {
    private List<TableItem> tableItems;

    public TableItems(){
        tableItems=new ArrayList<>();
    }
    public void store(String year){
        for (TableItem table:tableItems
             ) {
            table.setYear(year);
            table.store();
        }
    }

    public void add(TableItem tableItem){
        tableItems.add(tableItem);
    }
}
