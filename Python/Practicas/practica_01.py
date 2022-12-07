'''Practica 1 del timestre 22-P en Python'''
def promedio_general():
    '''Funcion para obtener el promedio general'''
    suma = 0
    for j in lista:
        suma += j
    print(f"El promedio es: {suma/cantidad}")

def promedio_de_dos(mayor, menor):
    '''Funcion para obtener el promedio entre la calificacion mayor y la menor'''
    promedio = (mayor + menor)/2
    print(f"El promedio de {mayor} y {menor} es: {promedio}")
    equivalencia(promedio)

def mayor_y_menor():
    '''Funcion para conocer la calificacion mayor y menor'''
    menor = 100
    mayor = -100
    for k in lista:
        if k > mayor:
            mayor = k
        if k < menor:
            menor = k
    print(f"La calificacion MAYOR es: {mayor}")
    print(f"La calificacion MENOR es: {menor}")
    promedio_de_dos(mayor, menor)

def equivalencia(promedio):
    '''Funcion para obtener la equivalencia del promedio de la calificaicon mayor y menor'''
    if promedio < 6:
        print("Y es equivalente a NA")
    elif promedio < 8:
        print("Y es equivalente a S")
    elif promedio < 9:
        print("Y es equivalente a B")
    else:
        print("Y es equivalente a MB")

cantidad = int(input("Cuantas calificaciones quieres agregar?: "))
i = 1
lista = []
while i <= cantidad:
    dato = int(input(f"[{i}]: "))
    lista.append(dato)
    i += 1
print(lista)
promedio_general()
mayor_y_menor()
