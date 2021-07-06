import java.util.*;
import java.io.*;
  
class HDPE2 {
    public float ID;
    public static HashMap map(Integer[] keys,
                              Float[] values)
    {
  
        int ks = keys.length;
        int vs = values.length;

        if (ks != vs) {
            throw new IllegalArgumentException(
                "The number of keys doesn't match the number of values.");
        }

        if (ks == 0) {
            return new HashMap();
        }
  
        HashMap<Integer, Float> map= new HashMap<Integer, Float>();
  
        for (int i = 0; i < ks; i++) {
            map.put(keys[i], values[i]);
        }
        return map;
    }


   
    /*public static float pipeArea(float[] arr){
        
        
    }*/
    public static void checkID(Map map, float nom){
        System.out.println(map);
        System.out.println(nom);
        //System.out.println(map.get(nom));
        
    }
    public static float calcOutDiam(float[] arr){
        return arr[0]/1000;
    }


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String[] vars = {"nominalDiameter","numPE", "numSDRPN","rateSD","rateLaid"};
        float[] user = new float[5];
        for(int i = 0; i < 5; i++){
            System.out.println(vars[i]);
            float x = s.nextFloat();
            user[i] = x;
        }
        Integer[] diam = {16.0f,20.0f,25.0f,32.0f,40.0f,50.0f,63.0f,75.0f,90.0f,110.0f,125.0f,140.0f,160.0f,180.0f,200.0f,225.0f,250.0f,280.0f,315.0f,355.0f,400.0f,450.0f,500.0f,560.0f,630.0f,710.0f,800.0f,900.0f,1000};
  
        Float[] arr41 = {0f,0f,0f,0f,0f,46.65f,59.65f,71.25f,85.45f,104.4f,118.75f,132.95f,151.95f,170.95f,189.9f,213.7f,237.45f,266f,299.15f,337.1f,379.85f,427.4f,474.85f,531.85f,598.35f,674.25f,759.75f,854.85f,949.7f};
        Float[] arr33 = {0f,0f,0f,0f,0f,46.65f,59.05f,70.25f,84.4f,103.15f,117.1f,131.25f,150.1f,168.7f,187.45f,211.00f,234.4f,262.5f,295.05f,332.6f,374.7f,421.65f,468.55f,523.15f,590.35f,665.25f,749.7f,843.35f,937.35f};
        Float[] arr26 = {0f,0f,0f,28.65f,36.65f,45.85f,57.8f,69f,82.75f,101.3f,115.1f,128.85f,147.2f,165.8f,184.15f,207.3f,230.25f,258f,290.1f,327.05f,368.55f,414.65f,460.75f,516.05f,580.5f,654.15f,737.2f,829.25f,921.6f};
        Float[] arr21 = {0f,0f,0f,28.5f,35.85f,45f,56.8f,67.55f,81.1f,99.05f,112.65f,126.2f,144.15f,162.3f,180.25f,202.8f,225.55f,252.45f,284.2f,320.3f,360.75f,405.85f,450.95f,505.15f,568.45f,640.45f,721.8f,812f,902.15f};
        Float[] arr17 = {0f,0f,21.65f,27.85f,35f,43.8f,55.15f,65.7f,78.85f,96.4f,109.75f,122.9f,140.45f,158f,175.55f,197.45f,219.6f,245.9f,276.6f,311.65f,351.35f,395.25f,439.05f,491.85f,553.25f,623.6f,702.75f,790.65f,878.35f};
        Float[] arr13 = {0f,16.65f,20.85f,27f,33.75f,42.35f,53.3f,63.45f,76.2f,93.3f,106.05f,118.8f,135.75f,152.65f,169.8f,190.9f,212.2f,237.7f,267.35f,301.40f,339.65f,382.05f,424.4f,475.45f,535f,602.9f,679.4f,764.2f,851.3f};
        Float[] arr11 = {12.65f,15.85f,20.2f,25.8f,32.35f,40.5f,51.05f,61.00f,73.1f,89.45f,101.55f,113.9f,130f,146.3f,162.6f,182.85f,203.40f,227.85f,256.30f,288.90f,325.50f,366.10f,406.85f,455.80f,512.65f,577.70f,651.10f,732.45f,815f};
        Float[] arr9 = {11.85f,15.2f,18.8f,24.55f,30.7f,38.45f,47.9f,57.7f,69.2f,84.7f,96.2f,107.75f,123.40f,138.70f,154.00f,173.25f,192.75f,215.85f,242.75f,273.55f,308.15f,346.80f,385.55f,431.80f,485.80f,547.35f,616.85f,0f,0f};
        Float[] arr7 = {11.2f,13.8f,17.75f,22.9f,28.65f,35.8f,45.3f,53.8f,64.7f,78.95f,89.85f,100.55f,115.05f,129.50f,143.75f,161.80f,179.80f,201.40f,226.55f,255.50f,287.8f,323.85f,0f,0f,0f,0f,0f,0f,0f};
        
        Map s41 = map(diam, arr41);
        Map s33 = map(diam, arr33);
        Map s26 = map(diam, arr26);
        Map s21 = map(diam, arr21);
        Map s17 = map(diam, arr17);
        Map s13 = map(diam, arr13);
        Map s11 = map(diam, arr11);
        Map s9 = map(diam, arr9);
        Map s7 = map(diam, arr7);
        
        calcOutDiam(user);//1st
        if(user[2] == 41.0)checkID(s41,user[0]);
        if(user[2] == 33.0)checkID(s33,user[0]);
        if(user[2] == 26.0)checkID(s26,user[0]);
        if(user[2] == 21.0)checkID(s21,user[0]);
        if(user[2] == 17.0)checkID(s17,user[0]);
        if(user[2] == 13.0)checkID(s13,user[0]);
        if(user[2] == 11.0)checkID(s11,user[0]);
        if(user[2] == 9.0)checkID(s9,user[0]);
        if(user[2] == 7.0)checkID(s7,user[0]);
        //checkSDR(user);//DMR
        
        //pipeArea(user)
    }
}