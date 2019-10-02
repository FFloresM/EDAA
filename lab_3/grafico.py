import numpy as np
import matplotlib.pyplot as plt

a, b, c = np.loadtxt('times', unpack=True)

plt.plot(a, b, 'ro-', label="suffix array")
plt.plot(a, c, 'bo-', label="fuerza bruta")
plt.legend()
plt.title("tamaño texto v/s tiempo")
plt.ylabel("tiempo (ms)")
plt.xlabel("cantidad de caracteres")
plt.grid()
plt.savefig("plot_t.png")
plt.show()