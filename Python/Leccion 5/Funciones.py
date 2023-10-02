#Comenzamos con Funciones 
#mi_funcion()#No se puede llamar antes de definir a una función
#Definimos una función
def mi_funcion():#Para identificar a la funcion utilizamos parentesis
    print("Saludos a todos los alumnos de la Tecnicatura")
mi_funcion()#Estamos llamando la funcion
mi_funcion()#Se puede llamar a una funcion N cantidad de veces
mi_funcion()

#Desempaquetando de listas o list Unpacking
def show (name, lastName):
    print(name+""+lastName)
person=["Ariel","Betancud"]
show (person[0],person[1])#Pasamos uno por uno los datos de la lista a la función
show(*person) # Esto es lo mismo que lo anterior pero lo pasamos todo junto
peron2=("Osvaldo","Giodanini")#desempaquetamos a traves de una tupla
show(*person2)
person3={"lastName": "Lucero", "name": "Natalia"}
show(**person3)