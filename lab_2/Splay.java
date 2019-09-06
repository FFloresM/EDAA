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