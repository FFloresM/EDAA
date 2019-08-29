

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
	/* Clase para arbol*/
	Nodo raiz;

	//constructor
	public Bst(int key){
		raiz = new Nodo(key);
	}
	//constructor por defecto
	public Bst(){
		raiz = null;
	}

	public static void main(String[] args){
		Bst arbol_bin = new Bst();
		arbol_bin.raiz = new Nodo(1);
		arbol_bin.raiz.izq = new Nodo(2);
		arbol_bin.raiz.der = new Nodo(3);
	}


}