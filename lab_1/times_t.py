import time
from busqueda import secuencial, binaria, doblada

v = []
for i in range(1,(2**20)+1):
	v.append(i)

func = [secuencial, binaria, doblada]

for f in func:
	for i in range(1,11):
		times = []
		T = 2**(i*2)
		for j in range(1,11):
			if f == binaria:
				ini_t = time.time()
				f(v,0,len(v)-1,T)
				end_t = time.time()
			else:
				ini_t = time.time()
				f(v,T)
				end_t = time.time()
			times.append(end_t - ini_t)

		print("{0},{1:.5f}".format(i+1, (sum(times) / len(times)*100) ))	
