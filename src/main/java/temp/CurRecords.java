package temp;

import java.lang.reflect.Method;
import java.util.HashMap;


public class CurRecords {
    private static HashMap<String,Record> curRecords;

    public void remove(String user){
        curRecords.remove(user);
    }

    public static Record getRecord(String username){
        return curRecords.get(username);
    }

    public static void add(String username,Object o){
        String className=o.getClass().getName();
        try {
            Method method = Record.class.getMethod("set" + className, Class.forName(className));
            Record record;
            if (curRecords.containsKey(username)) {
                record = curRecords.get(username);
            }else{
                record=new Record();
                curRecords.put(username,record);
            }
            method.invoke(record, o);
        }catch (Exception e){
            e.printStackTrace();
        }
    }




}
