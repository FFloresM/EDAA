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

def binaria(vector, elem):
	"""vector must be sorted"""
	i = 0
	d = len(vector)-1
	while i<=d:
		n = int((d+i)/2)
		if vector[n] == elem:
			return True
		elif vector[n] > elem:
			d = n-1
		elif vector[n] < elem:
			i = n+1
	return False

def doblada(vector, elem):
	"""
	docstring
	"""
	n = len(vector)
	if vector[0] == elem:
		return True

	i = 1;
	while i < n and vector[i] <= x:
		i = i*2

	#add binary search
			

v = []
for i in range(1,101):
	v.append(i)

T = 0
ini_sec = time.time()
print(secuencial(v,T))
end_sec = time.time()

ini_bin = time.time()
print(binaria(v,T))
end_bin = time.time()

print('bin: ', end_bin - ini_bin)
print('sec: ', end_sec - ini_sec)	
