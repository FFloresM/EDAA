from suffix_array import SuffixArray, findBrute
import sys
import time

#A,G,C,T 
f = open(sys.argv[1],'r')
data = f.read()

pat = "CTGTGGGGTCACTCGCCCP"
sa = SuffixArray(data)

ini_sa = time.time()
a,b = sa.search(pat) 
end_sa = time.time()
print(sa.sArr[a:b+1])

ini_bf = time.time()
print(findBrute(pat,data))
end_bf = time.time()

print("{}".format((end_sa - ini_sa)*100 ))
print("{}".format((end_bf - ini_bf)*100 ))


