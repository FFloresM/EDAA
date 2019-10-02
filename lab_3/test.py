from suffix_array import SuffixArray, findBrute
import sys
import time

#A,G,C,T 
f = open(sys.argv[1],'r')
data = f.read()

pat = "ACGTT"
n = len(data)
iters = [5,4,3,2,1]

for i in iters:
	datos = data[:(n//i)+1]
	sa = SuffixArray(datos)

	ini_sa = time.time()
	a,b = sa.search(pat) 
	end_sa = time.time()

	ini_bf = time.time()
	findBrute(pat,datos)
	end_bf = time.time()

	print("{0} {1:.5f} {2:.5f}".format(n//i, (end_sa - ini_sa)*100 , (end_bf - ini_bf)*100 ))