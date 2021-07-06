import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class HDPE {
    
    
    
    
    public static void main(String[] args) throws IOException{
        
       
        Scanner s = new Scanner(System.in);
        String[] vars = {"nominalDiameter","numPE", "numSDRPN","rateSD","rateLaid"};
        float[] user = new float[5];
        for(int i = 0; i < 5; i++){
            System.out.println(vars[i]);
            float x = s.nextFloat();
            user[i] = x;
        }
        checkSDR(user);
        calcOutDiam(user);
        pack();
        
    }
    public static float checkSDR(float[] arr){
        return 0;
    }
    public static float calcOutDiam(float[] arr){
        return arr[0]/1000;
    }
    public static float pack(){

        Storage x =new Storage();
        

        int [] diam = {16,20,25,32,40,50,63,75,90,110,125,140,160,180,200,225,250,280,315,355,400,450,500,560,630,710,800,900,1000};
        
        public ArrayList<HashMap<Integer, Float>> mylist = new ArrayList<HashMap<Integer, Float>>();
        for (int i=0; i<28; i++)
        {
            HashMap<Integer, Float> map = new HashMap<Integer, Float>();
            map.put(diam[i], x.arr41[i]);
            map.put(diam[i], arr33);
            map.put(diam[i], arr26);
            map.put(diam[i], arr21);
            map.put(diam[i], arr17);
            map.put(diam[i], arr13);
            map.put(diam[i], arr11);
            map.put(diam[i], arr9);
            map.put(diam[i], arr7);
            
            mylist.add(map);
        }
    } 
   
}
