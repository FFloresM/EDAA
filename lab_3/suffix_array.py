class SuffixArray():
	"""docstring for SufixArray"""
	def __init__(self, text):
		self.text = text+'$'
		self.sArr = self.suffix(self.text)

	def suffix(self, text):
		s = []
		for i in range(len(text)):
			s.append(text[i:])
		return sorted(range(len(s)), key=lambda i: s[i:])

	def search(self, pat):
		pat_len = len(pat)
		l = 0
		r = len(self.text)-1
		#busqueda binaria
		while l < r:
			m = (l+r)//2
			sa_index = self.sArr[m]
			if self.menor(sa_index, pat):
				l = m+1				
			else:
				r = m
		if self.neq(l, pat):
			return -1,-1
		else:
			lower_bound = l
		l = 0
		r = len(self.text)-1

		while l < r:
			m = (l+r)//2
			sa_index = self.sArr[m]
			if self.mayor(sa_index, pat):
				r = m
			else:
				l = m+1
		if self.neq(r, pat):
			r -= 1

		upper_bound = r
		
		return lower_bound, upper_bound

	def menor(self, i, pt):
		return self.text[i:i+len(pt)] < pt

	def mayor(self, i, pt):
		return self.text[i:i+len(pt)] > pt

	def neq(self, i, pt):
		return self.text[self.sArr[i]:self.sArr[i]+len(pt)] != pt

def findBrute(pat, text):
	n = len(text)
	m = len(pat)
	l = []
	for i in range(n-m+1):
		k = 0
		while k<m and text[i+k] == pat[k]:
			k+=1
		if(k==m):
			l.append(i)
	return l

if __name__ == '__main__':
	data = "AVADA KEDAVRA"
	pat = "AV"

	sa = SuffixArray(data)

	a,b = sa.search(pat) 
	print(sa.sArr[a:b+1])

	print(findBrute(pat,data))

