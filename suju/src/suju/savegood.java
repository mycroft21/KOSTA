package suju;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class savegood {
	
	public static HashMap<Integer, Cliunt> LIST = new HashMap<>();

	public savegood() {
		
	}

	public static void savegood(HashMap<Integer, Cliunt> LIST) throws Exception{
        
	    Set<Integer> it =  (Set<Integer>) LIST.keySet();   //이터레이터를 소환
		
	    for(Map.Entry<Integer, Cliunt> entry : LIST.entrySet()) {
	        Integer key = entry.getKey();
	        Cliunt value = entry.getValue();
	    }
	    
	    String save = "";
	      while(it.iterator().hasNext()){
	         Integer temp = it.iterator().next();
	         //String temp = (String) it.iterator();
	         Cliunt temv = new Cliunt();
	         temv = (Cliunt) LIST.get(temp);
	         save+=temp+"/";
	         save+=temv.ClNum+"/";
	         save+=temv.CLname+"/";
	         save+=temv.Ad+"/";
	         save+=temv.HP+"/";
	         save+=temv.sp+"/";
        }//while
        String sav = save.substring(0, save.length()-1);
        File f = new File("e:/Cliunt.txt");
        OutputStream fos = new FileOutputStream(f);
        fos.write(sav.getBytes());
        fos.close();      
     }//savegood
}
