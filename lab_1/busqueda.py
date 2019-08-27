import time

def secuencial(vector, elem):
	"""
	An iterative sequential search function.
	It returns True if elem is in vector,
	otherwise False.
	"""
	for i in vector:
		if i == elem:
			return True
	return False

def binaria(vector, l, r, elem):
	"""vector must be sorted"""
	while l <= r:
		n = int(l+(r-l)/2)
		if vector[n] == elem:
			return True
		elif vector[n] > elem:
			r = n-1
		elif vector[n] < elem:
			l = n+1
	return False

def doblada(vector, elem):
	"""
	docstring
	"""
	n = len(vector)
	if vector[0] == elem:
		return True

	i = 1;
	while i < n and vector[i] <= elem:
		i = i*2

	# binary search
	return binaria(vector, i/2, min(i,n), elem)


#test
if __name__ == '__main__':
	v = []
	for i in range(1,2**10):
		v.append(i)

	T = 1


	ini_sec = time.time()
	print(secuencial(v,T))
	end_sec = time.time()

	ini_bin = time.time()
	print(binaria(v,0,len(v)-1,T))
	end_bin = time.time()

	ini_dob = time.time()
	print(doblada(v,T))
	end_dob = time.time()

	#times
	print('sec: {0:.3f} {1}'.format((end_sec - ini_sec)*100, 'ms'))
	print('bin: {0:.3f} {1}'.format((end_bin - ini_bin)*100, 'ms'))
	print('dob: {0:.3f} {1}'.format((end_dob - ini_dob)*100, 'ms'))	
