import BST

public class SplayTree extends BST{

	Nodo root;
	
	SplayTree(){

	}

	void insert(int k){
		root = super.insert(int k);
		//agregar splays al insertar

	}
}