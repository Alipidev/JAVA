#VARIABLES
# Tipo string
my_variable_string = "My String variable"
print(my_variable_string)

#Tipo int
my_int_variable = 5
print(my_int_variable)

#Tipo bool
my_bool_variable = False
print(my_bool_variable)

#Concatenacion de variables en un print
print(my_variable_string,my_int_variable,my_bool_variable)
print("Este es el valor de:", my_bool_variable)

#Pasar de tipo int a str
my_int_to_str_variable = str(my_int_variable)
print(my_int_to_str_variable)
print(type(my_int_to_str_variable))

#Funciones del sistema len() cuenta cuantos caracteres tiene tu variable
print(len(my_variable_string))

#Variables en una sola linea, se puede hacer pero no es buena prática (FOCO DE ERRORES)
name, surname, alias, age= "Brais", "Moure", "Mouredev", 35
print("Me llamo:",name, "Apellido:", surname, "Mi alias", alias, "Mi edad es:", age)

#Para pedir datos (INPUTS)
first_name = input("Cual es tu nombre?")
agee = input("Cual es tu edad?")
#Para sacar los datos por pantalla
print("Nombre:", first_name)
print("Edad:", agee)

