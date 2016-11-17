package Calculate_test;

import java.util.ArrayList;

public class next_generation {
    public static void main(String[] args) {
     
	    ArrayList<String> a = new ArrayList<String>();
	    a.add(0, "Лада");
	    a.add(1, "Водга");
	    a.add(2, "ЗИЛ");
	    a.add(3, "Урал");
	    a.add(4, "Белаз");
	    a.add(5, "Запорожец");
	    a.add(6, "МАЗ");
	    a.add(7, "КАМАЗ");
	    a.add(8, "Москвич");
	    a.add(9, "Победа");
	    
	    for (int i = 0; i < a.size(); i++){
	    	System.out.println(a.get(i));
	    }
	    System.out.println();
	    a.set(0, "Мерседес");
	    a.set(1, "Опель");
	    a.set(2, "Мазда");
	    a.set(3, "Крайслер");
	    a.set(4, "МАН");
	    a.remove(9);
	    a.remove(8);
	    a.remove(0);
	    a.remove(1);
	    
	    for (int i = 3; i < 6; i++){
	    	System.out.println(a.get(i));
	    }
	    a.set(0, "Иномарки");
	    a.set(3, "Отечественные");
	    for (int i = 0; i < a.size(); i++){
	    	System.out.println(a.get(i));
	    }
	    
    
    
    }
}
