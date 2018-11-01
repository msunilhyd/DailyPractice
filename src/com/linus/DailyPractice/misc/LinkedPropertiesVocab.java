package com.linus.DailyPractice.misc;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class LinkedPropertiesVocab extends Properties{
    private static final long serialVersionUID = 1L;

    private Map<Object, Object> linkMap = new LinkedHashMap<Object,Object>();

    public void clear(){
        linkMap.clear();
    }
    public boolean contains(Object value){
        return linkMap.containsValue(value);
    }
    public boolean containsKey(Object key){
        return linkMap.containsKey(key);
    }
    public boolean containsValue(Object value){
        return linkMap.containsValue(value);
    }
    public Enumeration elements(){
        throw new RuntimeException("Method elements is not supported in LinkedProperties class");
    }
    public Set entrySet(){
        return linkMap.entrySet();
    }
    public boolean equals(Object o){
        return linkMap.equals(o);
    }
    public Object get(Object key){
        return linkMap.get(key);
    }
    public String getProperty(String key) {
        Object oval = get(key); //here the class Properties uses super.get()
        if(oval==null)return null;
        return (oval instanceof String) ? (String)oval : null; //behavior of standard properties
    }
    public boolean isEmpty(){
        return linkMap.isEmpty();
    }
    public  Enumeration keys(){
        Set keys=linkMap.keySet();
        return Collections.enumeration(keys);
    }
    public Set keySet(){
        return linkMap.keySet();
    }
    public void list(PrintStream out) {
        this.list(new PrintWriter(out,true));
    }
    public void list(PrintWriter out) {
        out.println("-- listing properties --");
        for (Map.Entry e : (Set<Map.Entry>)this.entrySet()){
            String key = (String)e.getKey();
            String val = (String)e.getValue();
            if (val.length() > 40) {
                val = val.substring(0, 37) + "...";
            }
            out.println(key + "=" + val);
        }
    }

    public Object put(Object key, Object value){
        return linkMap.put(key, value);
    }
    public int size(){
        return linkMap.size();
    }
    public Collection values(){
        return linkMap.values();
    }

    //for test purpose only
    public static void main(String[] arg)throws Exception{        
		String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String vocabConfigPath = rootPath + "vocab";

		LinkedPropertiesVocab vocabProps = new LinkedPropertiesVocab();
		vocabProps.load(new FileInputStream(vocabConfigPath));
		int count = 0;

		int setOf4s = 0;
		if(!vocabProps.isEmpty())
		{
			Collection<Object> entryMap = vocabProps.linkMap.values();
			
			for(Map.Entry<Object, Object> e : vocabProps.linkMap.entrySet())
			{
				if(count % 4 == 0)
				{
					System.out.println();
					//System.out.println("///////////////// Set " + e.getKey() );
					System.out.println("///////////////// Set " + e.getKey() + " : " +  e.getValue());
					System.out.println();

					setOf4s += 1;
				}
				System.out.println(e.getKey() + " : " + e.getValue());
				count += 1;
			}
		}
		
		System.out.println("Total vocab count is : " + count);
		System.out.println("No : of sets is  : " + setOf4s);
		
    }
}