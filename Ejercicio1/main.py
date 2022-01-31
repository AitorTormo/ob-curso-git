import os

import pathlib

import humanize



ruta = 'C:/Users/aitor/Downloads'

for archivos in os.listdir(ruta):

    print(archivos)

for archivos in os.scandir(ruta):

    print(archivos)

for archivos in os.listdir(ruta):

    path_total = os.path.join(ruta, archivos)

    if os.path.isfile(path_total):

        print(archivos, 'Esto es un fichero')

from humanize import naturalsize

archivos = os.listdir(ruta)

for i in range(len(archivos)):

    enlace = ruta + '/' +archivos[i]

    tamaño = os.path.getsize(enlace)

    print(archivos[i])
    print(naturalsize(tamaño))

    for nombre_directorio, dirs, ficheros in os.walk(enlace):
        for nombre_fichero in ficheros:
            print(nombre_fichero)












