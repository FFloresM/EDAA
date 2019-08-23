
def secuencial(vector, elem):
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
			d = n+1
		elif vector[n] < elem:
			i = n+1
	return False
			

v = []
for i in range(1,101):
	v.append(i)

T = 102
print(secuencial(v,T))
print(binaria(v,T))

	
	