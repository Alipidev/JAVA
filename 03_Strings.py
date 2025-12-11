
my_string = "Mi String"
my_order_string = "Mi otro String"
print(len(my_string))
print(len(my_order_string))

print(my_string + " " + my_order_string)

#Para que tenga un salto de linea
my_new_line_string = "Este es un string\ncon salto de linea"
print(my_new_line_string)

#Para que tenga tabulación
my_tab_string = "\tEste es un string tabulación"
print(my_tab_string)

#Para que tenga un escapado
my_scape_string = "\tEste es un string \nescapado"
print(my_scape_string)

#Si no quiero que haga alguna de las funciones solo hay que meter "\"

#Como formatear strings para que ponga las variables

name, surname, age = "Alina", "Puscas", 28
print("Mi nombre es {} {} y mi edad es {}".format(name, surname, age))
print("Mi nombre es %s %s y mi edad es %d" %(name, surname, age))
print(f"Mi nombre es {name} {surname} y mi edad es {age}")

#Desempaquetado de caracteres
language = "Python"
a, b, c, d, e, f = language
print(a)
print(b)
print(e)

#División

language_slice = language[1:3]
print(language_slice)

language_slice = language[1:]
print(language_slice)

language_slice = language[-2]
print(language_slice)

# Reverse darle la vuelta a la palabra

reserved_language = language[::-1]
print(reserved_language)

frase = "Hola Alina"
reserved_language_1 = frase[::-1]
print(reserved_language_1)

#Métodos o funciones del sistema

# Capitalize pone la primera en mayuscula
print(language.capitalize())
# Upper todo en mayuscula
print(language.upper())
# Count cuenta cuantas letras de X tipo tiene
print(language.count("t"))
# Isnumeric si es numerico
print(language.isnumeric())
# Lower todo minusculas
print(language.lower())
#Isupper comprueba si esta en mayusculas
print(language.upper().isupper())
