import 'package:flutter/material.dart';

class Listview2Screen extends StatelessWidget {
  final opciones = ['Ferrari', 'Audi', 'Seat Panda', 'Mercedes Benz', 'Ford'];

 

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar:
          AppBar(title: const Text('Listado'), centerTitle: true, elevation: 0),
      body: ListView.separated(
        //Pide una funcio 
        itemBuilder: (context, index) {
          ListTile(
            title: Text(opciones[index]),
            trailing: const Icon(Icons.arrow_forward_ios_outlined),
            onTap:(){}
          );
        }
        //Pide una funcion que quiere que use como separador
        separatorBuilder: () , 
        //Numero de elemento que tiene la lista que quiero que se muestren
        itemCount: opciones.length,
      )
    );
  }
}
