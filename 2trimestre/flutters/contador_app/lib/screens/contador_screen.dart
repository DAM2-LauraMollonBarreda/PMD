import 'package:flutter/material.dart';

class ContadorScreen extends StatefulWidget {
  @override
  State<ContadorScreen> createState() => _ContadorScreenState();
}

class _ContadorScreenState extends State<ContadorScreen> {
  final tamano30 = const TextStyle(fontSize: 30,fontWeight: FontWeight.bold);

  int contador=0;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      //Zona para la parte de arriba
      appBar: AppBar(
        //Titulo en la parte de arriba
        title: const Text("App contador"),
        //La sombra de la barra de arriba
        elevation: 0,
      ),
      //Fondo de la pantalla
      backgroundColor: Colors.white,
      body: Center(
        //Escribe en columna cada uno de los texto que se le pasan
        child: Column(
          //PROPIEDADES DE LAS COLUMNAS
          //Alinear los elementos de la columna
          mainAxisAlignment: MainAxisAlignment.center,

          children: [
            //tamano30 es un variable creada al principio del programa
            Text("Número de taps:",style: tamano30,),
            Text("$contador",style: TextStyle(fontSize: 30 )),
          ],
        ),
      ),
      
      //Boton de abajo a la derecha
      floatingActionButton: Row(
        mainAxisAlignment: MainAxisAlignment.spaceEvenly,
        children: [
          FloatingActionButton(
            child: const Icon(Icons.remove),
            onPressed:(){
              //Le tengo que avisar que a avido cambios en mi interface
              setState(() {
                contador--;
              });
            },
          ),
          //SizedBox(width: 60,),
          FloatingActionButton(
            child: const Icon(Icons.restore),
            onPressed:(){
              //Le tengo que avisar que a avido cambios en mi interface
              setState(() {
                contador=0;
              });
            },
          ),
          //SizedBox(width: 60,),
          FloatingActionButton(
            child: const Icon(Icons.add),
            onPressed:(){
              //Le tengo que avisar que a avido cambios en mi interface
              setState(() {
                contador++;
              });
            },
          ),
        ],
      ),
    );
  }
}

  