import pandas as pd
import numpy as np
from matplotlib import pyplot as pl

times = pd.read_csv('sec.csv')

x = times['n']
y = times['times']



pl.plot(x,y)
pl.show()