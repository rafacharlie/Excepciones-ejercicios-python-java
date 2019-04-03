'''
Realiza un programa que pida 6 números por teclado y nos diga cuál es el
máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
entero) el programa debe indicarlo y debe pedir de nuevo el número.

@author: Rafael Infante
'''

'''
creo una lista donde almacenare los 6 numeros enteros
'''
lista=[]
rango=6
leido=True

'''
Programa principal
'''
for i in range(0,rango):
    while True:
        try:
            numero=int(input("Introduzca un numero: "))
            lista.append(numero)
            break #rompo el flujo del while
        except ValueError:
            print("El valor introducido no es un numero.")
    
'''
obtengo el primer valor de la lista para compararlo con los demas valores
''' 
max=lista[0]

for i in range(0,rango):
    if max<lista[i]:
        max=lista[i]
print("El valor maximo es: ", max)