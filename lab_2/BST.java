

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

	boolean search(int k){
		return buscar(raiz, k);
	}
	//si encuentra el elemento lo retorna, sino retorna null
	boolean buscar(Nodo nodo, int key){
		if (nodo == null)  
			return false;
		if (nodo.key == key)
			return true;
		return (nodo.key > key)
			?buscar(nodo.izq, key)
			:buscar(nodo.der, key);
	}
	//ok
	boolean esRaiz(int key){
		return raiz.key == key;
	}

}