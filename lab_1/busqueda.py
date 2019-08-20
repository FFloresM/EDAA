
def secuencial(vector, elem):
	for i in vector:
		if i == elem:
			return True

def binaria(vector, elem):
	"""vector must be sorted"""
	i = 0
	d = len(vector)
	while 1:
		n = (d-i)/2
		if vector[n] == elem:
			return True
		elif n > elem:
			


	
	