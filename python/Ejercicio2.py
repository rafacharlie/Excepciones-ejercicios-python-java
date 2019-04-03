'''
Prueba del metodo apareaCon con excepciones

@author: Rafael Infante
'''

'''
Nota si la clase a importar esta fuera del paquete se importaria asi.
'''
from excepciones.GatoSimple import GatoSimple

garfield = GatoSimple("macho")
tom = GatoSimple("macho")
lisa = GatoSimple("hembra")

try:
    print(garfield.apareaCon(lisa))
except ValueError as e:
    print(e)


