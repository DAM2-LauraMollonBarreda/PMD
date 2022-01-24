import 'package:flutter/material.dart';

class Pantalla3Screen extends StatelessWidget {
   //Variable para guardar las opcines
   final opciones = ['pantalla2'];
  
  @override
  Widget build(BuildContext context) {
    return  Scaffold(
      //Ajustes de la tipica barra de arriba
      appBar: AppBar(
        //Titulo
        title: const Text('Pantalla 3'),
        //Sombreado
        elevation: 15,
        //Titulo centrado
        centerTitle: true,
      ),
      body: ListView(
        children: [
          ...opciones.map((opcion) => ListTile(
            title: Text(opcion),
            //Icono que sale al principio
            leading: Icon(Icons.list),
            //Icono que sale al final
            trailing: Icon(Icons.arrow_forward_ios_outlined),
            //Cuando se hace click en la lista
            onTap: (){
              Navigator.pushNamed(context, 'pantalla2');
            },
          ))
        ],

      ),
    );
  }
}