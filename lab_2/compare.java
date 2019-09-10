import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
//numeros aleatorios
import java.util.concurrent.ThreadLocalRandom;

class bst_and_splay_compare{

	public static void main(String args[]){

		int min,max;
		min = 1;
		max=1000000;
		
		Bst bst = new Bst();
		SplayTree spt = new SplayTree();
		List<Integer> ale = new ArrayList<>();
		TreeMap<Integer, Integer> tmap = new TreeMap<>();

		
		//valores aleatorios
		for(int i=0; i<100000;i++)
			ale.add(ThreadLocalRandom.current().nextInt(min, max + 1));

		
		for(int val : ale){
			bst.insert(val);
			spt.insert(val);
			tmap.put(val,null);
		}

		//bst.inorder();
		//System.out.println();

		int v = ale.get(23456);
		System.out.println(v);

		long start_b = System.nanoTime();
		if(bst.search(v))
			System.out.println("encontrado!!");
		else
			System.out.println(" NO EXISTE :(");
		long end_b = System.nanoTime();
		System.out.println(end_b - start_b);

		long start_s = System.nanoTime();
		if(spt.search(v))
			System.out.println("encontrado!!");
		else
			System.out.println(" NO EXISTE :(");
		long end_s = System.nanoTime();
		System.out.println(end_s - start_s);

		long start_m = System.nanoTime();
		if(tmap.get(v)!=null)
			System.out.println("encontrado!!");
		else
			System.out.println(" NO EXISTE :(");
		long end_m = System.nanoTime();
		System.out.println(end_s - start_s);
		//crear list con valores aleatorios.
		//insertar valores y buscar. comparar
	}
}