class SplayTree extends Bst{


	SplayTree(){
		super();
	}

	SplayTree(int k){
		super(k);
	}
	
	void inOrder(){
		inOrder(this.raiz);
	}
	
	//rotar derecha
	Nodo zig(Nodo x){
		Nodo y = x.izq;
		x.izq = y.der;
		y.der = x;
		return y;
	}

	//rotar izquierda
	Nodo zag(Nodo x){
		Nodo y = x.der;
		x.der = y.izq;
		y.izq = x;
		return y;
	}

	void splay(int k){
		this.raiz = splay(this.raiz, k);
	}

	Nodo splay(Nodo root, int k){
		//caso base: la raiz tiene el valor buscado
		if (root == null || root.key == k)
			return root;
		//k se encuentra en subarbol izq
		if(root.key > k){
			//k no esta en el subarbol
			if(root.izq == null)
				return root;
			//zig-zig
			if(root.izq.key > k){
				//
				root.izq.izq = splay(root.izq.izq, k);
				//
				root = zig(root);
			}
			//zig-zag
			else if(root.izq.key < k){
				//
				root.izq.der = splay(root.izq.der, k);
				//
				if(root.izq.der != null)
					root.izq = zag(root.izq);
			}
			//segunda rotacion de la raiz
			if(root.izq == null)
				return root;
			return zig(root);
		}
		else{
			//
			if(root.der == null)
				return root;
			//
			if(root.der.key > k){
				root.der.izq = splay(root.der.izq, k);
				if(root.der.izq != null)
					root.der = zig(root.der);
			}else if(root.der.key < k){
				root.der.der = splay(root.der.der, k);
				root = zag(root);
			}
			if(root.der == null)
				return root;
			return zag(root);
		}

	}

	public static void main(String[] args){
		SplayTree spt = new SplayTree(9);
		spt.insert(4);
		spt.insert(5);
		spt.insert(1);
		spt.insert(10);
		spt.inOrder();
		System.out.println();
	}
}