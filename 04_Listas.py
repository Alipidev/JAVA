#LISTAS

#2 opciones para definir la lista
my_list = list()
my_other_list = []

print(len(my_list))
 #Creamos una lista con edades
my_list = [35, 28, 62, 52, 30, 30, 17]
print(len(my_list))

my_other_list = [28, 1.58, "Alina", "Puscas"]
#Tipo de dato de mi lista
print(type(my_other_list))

#Acceder a los elementos por separado

print(my_other_list[0])
print(my_other_list[-2])

#Count cuenta cuantas veces se repite una misma palabra o digito
print(my_list.count(30))

#Definir lo que hay en myotherlist
age, height, name, surname = my_other_list
print(surname)

#Trabajar con los elemtos de la lista
#Añadir un elemnto a la lista
my_other_list.append("Alipus")
print(my_other_list)
#Insert insertamos datos
my_other_list.insert(1, "Rosa")
print(my_other_list)
#Remove eliminar algo de la lista
my_other_list.remove("Rosa")
print(my_other_list)
my_list.remove(30)
print(my_list)
#Pop elimina un elemento en concreto
my_list.pop(0)
print(my_list)
#Cargarme un elemento en concreto de la lista
del my_list[2]
print(my_list)
#Copiar la lista
my_new_list = my_list.copy()
print(my_new_list)
#Clear elimina toda la lista
my_list.clear()
print(my_list)
print(my_new_list)
#Ver la lista al reves
my_new_list.reverse()
print(my_new_list)
#Sort ordena por defecta de menor a mayor
my_new_list.sort()
print(my_new_list)



#Tipos dinamicos, hemos cambiado la lista a un string
my_list = "Hola Python"
print(my_list)
print(type(my_list))