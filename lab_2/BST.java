

class Nodo{
	/*Clase para nodo*/	
	int key;
	Nodo der, izq;

	public Nodo(int val){
		key = val;
		der = izq = null;
	}
}

class Bst{
	/* Clase para arbol binario de busqueda*/
	Nodo raiz;

	//constructor
	Bst(int key){
		raiz = new Nodo(key);
	}
	//constructor por defecto
	Bst(){
		raiz = null;
	}

	void insert(int key){
		raiz = insertar(raiz, key);
	}

	Nodo insertar(Nodo raiz, int key){
		if (raiz == null){
			raiz = new Nodo(key);
			return raiz;
		}
		
		if(key < raiz.key)
			raiz.izq = insertar(raiz.izq, key);
		else if(key > raiz.key)
			raiz.der = insertar(raiz.der, key);
		
		return raiz;
	
	}

	void inorder(){
		inOrder(raiz);
	}

	//muestra el recorrido inorder del bst solo para probar insert.
	void inOrder(Nodo raiz){
		if (raiz != null){
			inOrder(raiz.izq);
			System.out.print(raiz.key + " ");
			inOrder(raiz.der);
		}
	}

	Nodo search(int k){
		return buscar(raiz, k);
	}
	//si encuentra el elemento lo retorna, sino retorna null
	Nodo buscar(Nodo raiz, int key){
		if (raiz == null || raiz.key == key)
			return raiz;
		if (raiz.key < key)
			buscar(raiz.der, key);
		return buscar(raiz.izq, key);

	}
	//ok
	boolean esRaiz(int key){
		return raiz.key == key;
	}

	/*
	public static void main(String[] args){
		Bst bst = new Bst(10);
		bst.insert(5);
		bst.insert(3);
		bst.insert(7);
		bst.insert(9);
		bst.insert(1);

		bst.inorder();
		System.out.println();

		//search test
		if (bst.search(10)!=null)
			System.out.println("encontrado!!");
		else
			System.out.println("NO EXISTE :(");
		
	}
	*/

}