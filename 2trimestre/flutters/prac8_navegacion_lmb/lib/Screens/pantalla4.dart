import 'package:flutter/material.dart';

class Pantalla4Screen extends StatelessWidget {
  final opciones = ['pantalla3', 'pantalla5'];
  
  @override
  Widget build(BuildContext context) {
    return  Scaffold(
      //Ajustes de la tipica barra de arriba
      appBar: AppBar
      (
        //Titulo
        title: const Text('Pantalla 4'),
      
        //Sombreado
        elevation: 15,
        //Titulo centrado
        centerTitle: true,
      ),

      body: ListView.separated(
        itemBuilder: (context, index) {
          return ListTile(
            title: Text(opciones[index]),
            //Icono que sale al principio
            leading: Icon(Icons.list),
            //Icono que sale al final
            trailing: Icon(Icons.arrow_forward_ios_outlined),
            //Cuando se hace click en la lista
            onTap: (){
                Navigator.pushNamed(context, opciones[index]);
            },
          );
        },
        //Separa cada uno de los elementos de la lista
        separatorBuilder: (_ , __)=> Divider(),
        //Numero de elemntos que tiene la lista
        itemCount: opciones.length,
      ),
    );
  }
}