class SplayTree extends Bst{
	/* Clase para 
	 * Splay tree
	 */

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


	void busca(int k){
		if (buscar(this.raiz, k))
			splay(k);
		else
			System.out.println("Valor no encontrado");
	}

	void splay(int k){
		this.raiz = splay(this.raiz, k);
	}

	Nodo splay(Nodo root, int k){
		if(root.key > k){
			if(root.izq == null)
				return root;
			//zig-zig
			if(root.izq.key > k){
				root.izq.izq = splay(root.izq.izq, k);
				root = zig(root);
			}
			else if(root.izq.key < k){
				root.izq.der = splay(root.izq.der, k);
				if(root.izq.der != null)
					root.izq = zag(root.izq);
			}
			if(root.izq == null)
				return root;
			return zig(root);
		}
		else{
			if(root.der == null)
				return root;
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

	void preorder(){
		preOrder(this.raiz);
	}

	//solo para chequear los splays
	void preOrder(Nodo nodo){
		if(nodo != null){
        System.out.print(nodo.key + " "); 
        preOrder(nodo.izq); 
        preOrder(nodo.der); 
		}
	}

}